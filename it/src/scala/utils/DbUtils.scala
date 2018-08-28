package scala.utils

import org.scalatest.{BeforeAndAfterAll, WordSpec}
import play.api.db.{Database, Databases}

trait DbUtils extends WordSpec with BeforeAndAfterAll {

  private var database: Database = _

  override def beforeAll() {
    database = Databases(
      driver = "com.mysql.jdbc.Driver",
      url = "jdbc:mysql://localhost/truequotes",
      name = "mydatabase",
      config = Map(
        "username" -> "root",
        "password" -> "root"
      )
    )
  }

  def withDb(execute: Database => Unit): Unit = {
    execute(database)
  }

  override def afterAll() {
    database.shutdown
  }

}
