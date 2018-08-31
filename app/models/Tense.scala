package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Tense(
  id: Int,
  name: String
) {}

object Tense {

  implicit val reader: Reads[Tense]   = Json.reads[Tense]
  implicit val writer: OWrites[Tense] = Json.writes[Tense]
  implicit val format: OFormat[Tense] = Json.format[Tense]

  val Present     = Tense(1, "Présent")
  val Past        = Tense(2, "Passé")
  val Futur       = Tense(3, "Futur")
  val PastPresent = Tense(4, "Passé composé")

  val tenses: List[Tense] = List(Present, Past, Futur, PastPresent)

  def parse(id: Int): Tense = {
    tenses.filter(tense => tense.id.equals(id)).head
  }

}
