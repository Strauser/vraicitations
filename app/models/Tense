package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Tense(name: String) {}

object Tense {

  implicit val reader: Reads[Tense]   = Json.reads[Tense]
  implicit val writer: OWrites[Tense] = Json.writes[Tense]
  implicit val format: OFormat[Tense] = Json.format[Tense]

  val Present     = Tense("present")
  val Past        = Tense("past")
  val Futur       = Tense("futur")
  val PastPresent = Tense("pastPresent")

  val tenses: List[Tense] = List(Present, Past, Futur, PastPresent)

  def parse(name: String): Tense = {
    tenses.filter(tense => tense.name.equals(name)).head
  }

}
