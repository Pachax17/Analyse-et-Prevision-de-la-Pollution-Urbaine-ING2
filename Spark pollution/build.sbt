ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "org.example"
ThisBuild / version := "0.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "spark-pollution",
    libraryDependencies ++= Seq(          // ✅ ici
      "org.apache.spark" %% "spark-core" % "3.5.1",
      "org.apache.spark" %% "spark-sql"  % "3.5.1"
    )
  )
