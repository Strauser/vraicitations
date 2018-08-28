package dao

import java.sql.ResultSet
import javax.inject.{Inject, Singleton}

import models.{Author, Quote}
import play.api.db._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class QuoteDao @Inject()(db: Database) {


  def getAllQuotes: Future[List[Quote]] = Future(db.withConnection(
    connection => {
      val rs = connection.prepareStatement(
        "SELECT " +
            "quotes.quote_id, " +
            "quotes.quote, " +
            "authors.author_id, " +
            "authors.name " +
          "FROM quotes " +
            "INNER JOIN authors ON quotes.author = authors.author_id"
      ).executeQuery()

      rs.first()
      rowsToQuotes(rs, Nil)
    }
  ))



  def rowsToQuotes(rs: ResultSet, quotes: List[Quote]): List[Quote] = {
    val quote = Quote.fromRow(rs)

    if(rs.isLast) return (quote :: quotes).reverse
    rs.next()
    rowsToQuotes(rs, quote :: quotes)
  }

}
