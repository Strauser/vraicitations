package controllers

import javax.inject.{Inject, Singleton}

import dao.QuoteDao
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class QuotesController @Inject()(cc: ControllerComponents, quoteDao: QuoteDao) extends AbstractController(cc) {

  import scala.concurrent.ExecutionContext.Implicits.global

  def getQuote() = Action.async { implicit request: Request[AnyContent] =>
    quoteDao.getRandomQuote.map {
      quote =>
        Ok(Json.toJson(quote))
    }
  }

}
