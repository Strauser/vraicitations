package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class ContentType(name: String) {}

object ContentType {

  implicit val reader: Reads[ContentType]   = Json.reads[ContentType]
  implicit val writer: OWrites[ContentType] = Json.writes[ContentType]
  implicit val format: OFormat[ContentType] = Json.format[ContentType]

  val sentence = ContentType("sentence")
  val time = ContentType("time")
  val space = ContentType("space")
  val verb = ContentType("verb")

  val contentTypes: List[ContentType] = List(sentence, time, space, verb)

  def parse(name: String): ContentType = {
    contentTypes.filter((contentType: ContentType) => contentType.name.equals(name)).head
  }
}

