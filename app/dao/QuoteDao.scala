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
            " AND (quotes.person IS NULL OR quotes.person = content.person)" +
            " AND (quotes.tense IS NULL  OR quotes.tense  = content.tense)"
      ).executeQuery()

      rs.first()
      rowsToQuotes(rs)
    }
  ))

  def getRandomQuote: Future[Quote] = Future(db.withConnection(
    connection => {

      val query = "SELECT" +
          " quotes.quote_id," +
          " quotes.quote," +
          " quotes.type as quote_type," +
          " quotes.person as quote_person," +
          " quotes.tense as quote_tense," +
          " author.author_id," +
          " author.name," +
          " content.content_id," +
          " content.content," +
          " content.type as content_type," +
          " content.person as content_person," +
          " content.tense as content_tense" +
        " FROM quotes" +
          " INNER JOIN (" +
            " SELECT author_id," +
              " name" +
            " FROM authors" +
            " ORDER BY RAND()" +
            " LIMIT 1" +
            ") as author" +
          " INNER JOIN (" +
            " SELECT content_id," +
              " content," +
              " type," +
              " person," +
              " tense" +
            " FROM contents" +
            " ORDER BY RAND()" +
            " LIMIT 1" +
          ") as content ON " +
            " quotes.type   = content.type" +
            " AND (quotes.person IS NULL OR quotes.person = content.person)" +
            " AND (quotes.tense IS NULL  OR quotes.tense  = content.tense)" +
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
