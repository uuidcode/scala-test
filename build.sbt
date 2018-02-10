val gson = "com.google.code.gson" % "gson" % "2.3.1"

lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.5",
    libraryDependencies += gson
  )