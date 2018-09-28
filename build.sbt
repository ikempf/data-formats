import Dependencies._

lazy val dataFormats = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "data-formats",
    libraryDependencies ++= List(
      circeCore,
      circeGeneric,
      circeParser
    )
  )
