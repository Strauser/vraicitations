package models

import java.sql.ResultSet

import play.api.libs.json._

case class Quote(
  quoteId: Int,
  quote: String,
  content: QuoteContent,
  author: Author
) {
  def getfullQuote: Quote =
    Quote(
      quoteId,
      quote.replace(Quote.REPLACE_IDENTIFIER, content.content),
      content,
      author
  )
}

object Quote {
  val REPLACE_IDENTIFIER = "[...]"

  implicit val reader: Reads[Quote]   = Json.reads[Quote]
  implicit val writer: OWrites[Quote] = Json.writes[Quote]
  implicit val format: OFormat[Quote] = Json.format[Quote]

  def fromRow(rs: ResultSet) : Quote = {
    Quote(
      rs.getInt("quote_id"),
      rs.getString("quote"),
      QuoteContent.fromRow(rs),
      Author.fromRow(rs)
    )
  }

}
