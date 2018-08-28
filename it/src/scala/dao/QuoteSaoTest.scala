package scala.dao

import dao.QuoteDao
import org.scalatest._
import play.api.db.Databases

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class QuoteSaoTest extends WordSpec with Matchers with BeforeAndAfter {

  val database = Databases(
    driver = "com.mysql.jdbc.Driver",
    url = "jdbc:mysql://localhost/truequotes",
    name = "mydatabase",
    config = Map(
      "username" -> "root",
      "password" -> "root"
    )
  )

  private val dao = new QuoteDao(database)

  "a select query" should {
    "return a list of quotes" in {

      val quotes = Await.result(dao.getAllQuotes, Duration("1 minute"))
      quotes should have size 1
      database.shutdown

    }
  }


}
