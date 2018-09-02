package dao

import java.sql.ResultSet
import javax.inject.{Inject, Singleton}

import models.Quote
import play.api.db._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class QuoteDao @Inject()(db: Database) {


  def getAllQuotes: Future[List[Quote]] = Future(db.withConnection(
    connection => {
      val rs = connection.prepareStatement(
        "SELECT" +
          " quotes.quote_id," +
          " quotes.quote," +
          " quotes.type as quote_type," +
          " quotes.person as quote_person," +
          " quotes.tense as quote_tense," +
          " '' as author_id," +
          " '' as name," +
          " content.content_id," +
          " content.content," +
          " content.type as content_type," +
          " content.person as content_person," +
          " content.tense as content_tense" +
        " FROM quotes" +
          " INNER JOIN (" +
            " SELECT content_id," +
            " content," +
            " type," +
            " person," +
            " tense" +
            " FROM contents" +
          ") as content ON " +
            " quotes.type   = content.type" +
            " AND (content.person IS NULL OR quotes.person IS NULL OR quotes.person = content.person)" +
            " AND (content.tense  IS NULL OR quotes.tense  IS NULL OR quotes.tense  = content.tense)"
      ).executeQuery()
      rs.first()
      rowsToQuotes(rs)
    }
  ))

  def getRandomQuote: Future[Quote] = Future(db.withConnection(
    connection => {

      val query = "SELECT" +
          " quote.quote_id," +
          " quote.quote," +
          " quote.quote_type," +
          " quote.quote_person," +
          " quote.quote_tense," +
          " author.author_id," +
          " author.name," +
          " true_authors.name as true_name," +
          " true_authors.author_id as true_author_id," +
          " contents.content_id," +
          " contents.content," +
          " contents.type as content_type," +
          " contents.person as content_person," +
          " contents.tense as content_tense" +
        " FROM contents" +
          " INNER JOIN (" +
            " SELECT" +
              " author_id," +
              " name" +
            " FROM authors" +
            " ORDER BY RAND()" +
            " LIMIT 1" +
            ") as author" +
          " INNER JOIN (" +
            " SELECT" +
              " quote_id," +
              " quote," +
              " type as quote_type," +
              " person as quote_person," +
              " tense as quote_tense," +
              " true_author" +
            " FROM quotes" +
            " ORDER BY RAND()" +
            " LIMIT 1" +
          ") as quote" +
            " ON quote.quote_type = contents.type" +
            " AND (contents.person IS NULL OR quote.quote_person IS NULL OR quote.quote_person = contents.person)" +
            " AND (contents.tense  IS NULL OR quote.quote_tense  IS NULL OR quote.quote_tense  = contents.tense)" +
        " LEFT JOIN true_authors " +
          " ON quote.true_author = true_authors.author_id" +
        " ORDER BY RAND()" +
        " LIMIT 1"

      val rs = connection.prepareStatement(query).executeQuery()

      rs.first()
      Quote.fromRow(rs)
    }
  ))

  def rowsToQuotes(rs: ResultSet): List[Quote] = {
    def rowsToQuotes(rs: ResultSet, quotes: List[Quote]): List[Quote] = {
      val quote = Quote.fromRow(rs)

      if(rs.isLast) return (quote :: quotes).reverse
      rs.next()
      rowsToQuotes(rs, quote :: quotes)
    }
    rowsToQuotes(rs, Nil)
  }

}
