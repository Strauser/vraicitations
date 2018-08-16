import sun.security.tools.PathList

name := "vraicitations"

organization := "fr.strude"

scalaVersion := "2.12.6"

sbtVersion := "1.0.4"

lazy val vraicitations = (project in file(".")).enablePlugins(PlayScala)
.settings(

  libraryDependencies ++= Seq(
    guice,

    "org.webjars"     % "bootstrap"     % "3.1.1-2",
    "org.webjars"     % "jquery"         % "3.3.1-1",
    "org.webjars"     % "popper.js"      % "1.14.3",

    "org.scalatest" %% "scalatest"    % "3.0.5" % "test"
  )
)


