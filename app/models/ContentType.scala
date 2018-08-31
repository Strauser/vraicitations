package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class ContentType(id: Int, name: String) {}

object ContentType {

  implicit val reader: Reads[ContentType]   = Json.reads[ContentType]
  implicit val writer: OWrites[ContentType] = Json.writes[ContentType]
  implicit val format: OFormat[ContentType] = Json.format[ContentType]

  val SENTENCE = ContentType(1, "Phrase")
  val TIME     = ContentType(2, "Temps")
  val SPACE    = ContentType(3, "Espace")
  val VERB     = ContentType(4, "Verbe")

  val contentTypes: List[ContentType] = List(SENTENCE, TIME, SPACE, VERB)

  def parse(id: Int): ContentType = {
    contentTypes.filter((contentType: ContentType) => contentType.id.equals(id)).head
  }
}

