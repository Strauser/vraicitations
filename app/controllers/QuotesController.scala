package controllers

import javax.inject.{Inject, Singleton}

import models.{Author, Quote}
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class QuotesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getQuote() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(Quote("J'aime le dab", Author("Roger"))))
  }

}
