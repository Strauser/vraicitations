package controllers

import javax.inject.{Inject, Singleton}

import services.QuoteService
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class QuotesController @Inject()(cc: ControllerComponents, quoteService: QuoteService) extends AbstractController(cc) {

  import scala.concurrent.ExecutionContext.Implicits.global

  def getRandomQuote() = Action.async { implicit request: Request[AnyContent] =>
    quoteService.getRandomQuote.map {
      quote =>
        Ok(Json.toJson(quote.getfullQuote))
    }
  }

  def getQuotes() = Action.async { implicit request: Request[AnyContent] =>
    quoteService.getAllQuotes.map {
      quotes =>
        Ok(Json.toJson(quotes.map(_.getfullQuote)))
    }
  }

}
