package scala.dao

import dao.QuoteDao
import org.scalatest._

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.utils.DbUtils

class QuoteDaoTest extends WordSpec with Matchers with DbUtils {

  "a select query" should {
    "return a list of quotes" in withDb {
      db =>
        val dao = new QuoteDao(database)
        val quotes = Await.result(dao.getAllQuotes, Duration("1 minute"))
        quotes should have size 1
    }
  }
}
