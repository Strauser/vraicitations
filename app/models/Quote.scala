package models

import play.api.libs.json._

case class Quote(
  quote: String,
  author: Author
) {



}

object Quote {
  implicit val reader: Reads[Quote] = Json.reads[Quote]
  implicit val writer: OWrites[Quote] = Json.writes[Quote]
  implicit val format: OFormat[Quote] = Json.format[Quote]
}
