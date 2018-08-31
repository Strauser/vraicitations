package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Person(id: Int, name: String) {}

object Person {

  implicit val reader: Reads[Person]   = Json.reads[Person]
  implicit val writer: OWrites[Person] = Json.writes[Person]
  implicit val format: OFormat[Person] = Json.format[Person]

  val FIRST         = Person(1, "Première personne du singulier")
  val SECOND        = Person(2, "Seconde personne du singulier")
  val THIRD         = Person(3, "Troisième personne du singulier")
  val FIRST_PLURAL  = Person(4, "Première personne du pluriel")
  val SECOND_PLURAL = Person(5, "Seconde personne du pluriel")
  val THIRD_PLURAL  = Person(6, "Troisième personne du pluriel")

  val persons: List[Person] = List(FIRST, SECOND, THIRD, FIRST_PLURAL, SECOND_PLURAL, THIRD_PLURAL)

  def parse(id: Int): Person = {
    persons.filter((person: Person) => person.id.equals(id)).head
  }

}
