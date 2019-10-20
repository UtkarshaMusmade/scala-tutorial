name := "scala-tutorial"

version := "0.1"

scalaVersion := "2.13.1"

lazy val root = (project in file(".")).aggregate(scalabasics)
lazy val scalabasics = project in file("scalabasics")
