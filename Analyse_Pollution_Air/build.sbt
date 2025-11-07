ThisBuild / scalaVersion := "2.12.18"        // version compatible Spark 3.5.x
ThisBuild / organization := "org.example"
ThisBuild / version := "0.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "Analyse_Pollution_Air",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.5.1",
      "org.apache.spark" %% "spark-sql"  % "3.5.1"
    )
  )
