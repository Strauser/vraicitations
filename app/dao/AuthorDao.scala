package dao

import java.sql.ResultSet
import javax.inject.{Inject, Singleton}

import models.{Author, Quote}
import play.api.db._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
class AuthorDao @Inject()(db: Database) {


  def getAllAuthors: Future[List[Author]] = Future(db.withConnection(
    connection => {
      val rs = connection.prepareStatement(
        "SELECT" +
          " author.author_id," +
          " author.name," +
        " FROM authros"
      ).executeQuery()

      rs.first()
      rowsToAuthor(rs)
    }
  ))

  def getRandomAuthor: Future[Quote] = Future(db.withConnection(
    connection => {

      val query = "SELECT" +
          " author.author_id," +
          " author.name," +
        " FROM authros" +
        " ORDER BY RAND()" +
        " LIMIT 1"

      val rs = connection.prepareStatement(query).executeQuery()

      rs.first()
      Quote.fromRow(rs)
    }
  ))

  def rowsToAuthor(rs: ResultSet): List[Author] = {
    def rowsToAuthor(rs: ResultSet, authors: List[Author]): List[Author] = {
      val author = Author.fromRow(rs)

      if(rs.isLast) return (author :: authors).reverse
      rs.next()
      rowsToAuthor(rs, author :: authors)
    }
    rowsToAuthor(rs, Nil)
  }

}
