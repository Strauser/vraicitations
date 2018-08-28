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
        val dao = new QuoteDao(db)
        val quotes = Await.result(dao.getAllQuotes, Duration("1 minute"))
        (quotes.size >= 1) should be(true)
    }
  }

  "a select random query" should {
    "return a single quote" in withDb {
      db =>
        val dao = new QuoteDao(db)
        val quote = Await.result(dao.getRandomQuote, Duration("1 minute"))
        (quote.quoteId > 0) should be(true)
    }
  }

}
