name := "scala-tutorial"

version := "0.1"

scalaVersion := "2.13.1"

lazy val root = (project in file(".")).aggregate(scalabasics).aggregate(controlstructures)
  .aggregate(scalaclasses)
lazy val scalabasics = project in file("scalabasics")
lazy val controlstructures = project in file("controlstructures")
lazy val scalaclasses = project in file("scalaclasess")
