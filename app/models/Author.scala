package models

import java.sql.ResultSet

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class Author(
   authorId: Int,
   name: String
) {}

object Author {
  implicit val reader: Reads[Author] = Json.reads[Author]
  implicit val writer: OWrites[Author] = Json.writes[Author]
  implicit val format: OFormat[Author] = Json.format[Author]


  def fromRow(rs: ResultSet): Author = {
    Author(
      rs.getInt("author_id"),
      rs.getString("name")
    )
  }

}