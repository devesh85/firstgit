lazy val commonSettings = Seq(
  organization := "com.devesh",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
// settings ( commonSettings : _*).
 settings (
    name := "firstgit"
 ).
 settings(
    commonSettings : _*
  )


