package utils

object ParseUtils {

  def parseO[T](id: Int, parse: Int => T): Option[T] = {
    Option(id) match {
      case Some(0) => None
      case Some(value) => Some(parse(value))
      case None => None
    }
  }


}
