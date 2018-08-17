import sun.security.tools.PathList

name := "vraicitations"

organization := "fr.strude"

scalaVersion := "2.12.6"

sbtVersion := "1.0.4"

lazy val vraicitations = (project in file(".")).enablePlugins(PlayScala)
.settings(

  libraryDependencies ++= Seq(
    guice,
    filters,

    "org.flywaydb"  %% "flyway-play"          % "5.0.0",
    "mysql"          % "mysql-connector-java" % "5.1.12",

    "org.webjars"    % "bootstrap"   % "3.1.1-2",
    "org.webjars"    % "jquery"      % "1.11.1",
    "org.webjars"    % "popper.js"   % "1.14.3",
    "org.webjars"    % "vue"         % "2.5.16",

    "org.scalatest" %% "scalatest"   % "3.0.5" % "test"
  )
)


