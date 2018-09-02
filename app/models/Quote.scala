package models

import java.sql.ResultSet

import play.api.libs.json._
import utils.ParseUtils

case class Quote(
  quoteId: Int,
  quote: String,
  content: Content,
  contentType: ContentType,
  person: Option[Person] = None,
  tense: Option[Tense] = None,
  author: Author,
  true_author: Option[Author]
) {

  def getfullQuote: Quote =
    Quote(
      quoteId,
      quote.replace(Quote.REPLACE_IDENTIFIER, content.content),
      content,
      contentType,
      person,
      tense,
      author,
      true_author
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
      Content.fromRow(rs),
      ContentType.parse(rs.getInt("quote_type")),
      ParseUtils.parseO[Person](rs.getInt("quote_person"), Person.parse),
      ParseUtils.parseO[Tense](rs.getInt("quote_tense"), Tense.parse),
      Author.fromRow(rs),
      if(rs.getInt("true_author_id") > 0) Some(Author.trueAuthorFromRow(rs)) else None
    )
  }

}
