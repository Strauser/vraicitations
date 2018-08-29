package utils

import com.typesafe.config.{Config, ConfigFactory}

trait AppConf {
  val config: Config = ConfigFactory.load().atPath("app")
}
