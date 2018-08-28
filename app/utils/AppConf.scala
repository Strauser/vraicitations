package utils

import com.typesafe.config.{Config, ConfigFactory}

class AppConf {
  val config: Config = ConfigFactory.load().atPath("app")
}
