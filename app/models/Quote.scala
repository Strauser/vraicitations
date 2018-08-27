package models

import java.sql.ResultSet

import play.api.libs.json._

case class Quote(
  quoteId: Int,
  quote: String,
  author: Author
) {



}

object Quote {
  implicit val reader: Reads[Quote] = Json.reads[Quote]
  implicit val writer: OWrites[Quote] = Json.writes[Quote]
  implicit val format: OFormat[Quote] = Json.format[Quote]

  def fromRow(rs: ResultSet) : Quote = {
    Quote(
      rs.getInt("quote_id"),
      rs.getString("quote"),
      Author.fromRow(rs)
    )
  }
}
