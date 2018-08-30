package models

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Person(name: String) {}

object Person {

  implicit val reader: Reads[Person]   = Json.reads[Person]
  implicit val writer: OWrites[Person] = Json.writes[Person]
  implicit val format: OFormat[Person] = Json.format[Person]

  val First        = Person("first")
  val Second       = Person("second")
  val Third        = Person("third")
  val FirstPlural  = Person("firstPlural")
  val SecondPlural = Person("secondPlural")
  val ThridPlural  = Person("thridPlural")

  val persons: List[Person] = List(First, Second, Third, FirstPlural, SecondPlural, ThridPlural)

  def parse(name: String): Person = {
    persons.filter((person: Person) => person.name.equals(name)).head
  }

}
