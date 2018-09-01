package services
import javax.inject.{Inject, Singleton}

import dao.{AuthorDao, QuoteDao}

@Singleton
class QuoteService @Inject()(quoteDao: QuoteDao, authorDao: AuthorDao){

  def getAllQuotes = quoteDao.getAllQuotes

  def getRandomQuote = quoteDao.getRandomQuote

}
