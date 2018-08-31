package models

import java.sql.ResultSet

import play.api.libs.json.{Json, OFormat, OWrites, Reads}

case class QuoteContent(content_id: Int, content: String, contentType: ContentType, person: Option[Person], tense: Option[Tense]) {
  override def toString: String = content
}

object QuoteContent {

  implicit val reader: Reads[QuoteContent]   = Json.reads[QuoteContent]
  implicit val writer: OWrites[QuoteContent] = Json.writes[QuoteContent]
  implicit val format: OFormat[QuoteContent] = Json.format[QuoteContent]

  def fromRow(rs: ResultSet): QuoteContent = {
    QuoteContent(
      rs.getInt("content_id"),
      rs.getString("content"),
      ContentType.parse(rs.getInt("type")),
      parseO(rs.getInt("person"), Person.parse),
      parseO(rs.getInt("tense"), Tense.parse)
    )
  }

  def parseO[T](id: Int, parse: Int => T): Option[T] = {
    Option(id) match {
      case Some(value) => Some(parse(value))
      case None => None
    }
  }
}
