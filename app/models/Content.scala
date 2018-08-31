package models

import java.sql.ResultSet

import play.api.libs.json.{Json, OFormat, OWrites, Reads}
import utils.ParseUtils

case class Content(
  content_id: Int,
  content: String,
  contentType: ContentType,
  person: Option[Person],
  tense: Option[Tense]) {}

object Content {

  implicit val reader: Reads[Content]   = Json.reads[Content]
  implicit val writer: OWrites[Content] = Json.writes[Content]
  implicit val format: OFormat[Content] = Json.format[Content]

  def fromRow(rs: ResultSet): Content = {
    Content(
      rs.getInt("content_id"),
      rs.getString("content"),
      ContentType.parse(rs.getInt("content_type")),
      ParseUtils.parseO(rs.getInt("content_person"), Person.parse),
      ParseUtils.parseO(rs.getInt("content_tense"), Tense.parse)
    )
  }

}
