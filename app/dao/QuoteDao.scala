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
            " authors.author_id," +
            " authors.name," +
            " contents.content_id," +
            " contents.content," +
            " contents.type," +
            " contents.person," +
            " contents.tense" +
          " FROM quotes" +
            " INNER JOIN authors ON quotes.author = authors.author_id"
      ).executeQuery()

      rs.first()
      rowsToQuotes(rs)
    }
  ))

  def getRandomQuote: Future[Quote] = Future(db.withConnection(
    connection => {
      val rs = connection.prepareStatement(
        "SELECT" +
            " quotes.quote_id," +
            " quotes.quote," +
            " authors.author_id," +
            " authors.name," +
            " contents.content_id," +
            " contents.content," +
            " contents.type," +
            " contents.person," +
            " contents.tense" +
          " FROM quotes" +
            " INNER JOIN authors  ON quotes.author  = authors.author_id" +
            " INNER JOIN contents ON quotes.content = contents.content_id" +
          " ORDER BY RAND()" +
          " LIMIT 1"
      ).executeQuery()

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
