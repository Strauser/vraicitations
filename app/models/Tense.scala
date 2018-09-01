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

  val PRESENT     = Tense(1, "Présent")
  val PAST        = Tense(2, "Passé")
  val FUTUR       = Tense(3, "Futur")
  val PASTPRESENT = Tense(4, "Passé composé")
  val INFINITIF   = Tense(5, "Infinitif")
  val SUBJONCTIV  = Tense(6, "Subjonctif présent")

  val tenses: List[Tense] = List(PRESENT, PAST, FUTUR, PASTPRESENT, INFINITIF, SUBJONCTIV)

  def parse(id: Int): Tense = {
    tenses.filter(tense => tense.id.equals(id)).head
  }

}
