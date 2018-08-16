package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Author(
   name: String
) {



}

object Author {
  implicit val reader: Reads[Author] = Json.reads[Author]
  implicit val writer: OWrites[Author] = Json.writes[Author]
  implicit val format: OFormat[Author] = Json.format[Author]
}