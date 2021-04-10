inThisBuild(Def.settings(
  organization := "org.scalajs.tools",
  version := "0.1-SNAPSHOT",
  scalaVersion := "3.0.0-RC2",
  scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-feature",
    "-encoding", "utf8"
  )
))

val `scala-js-ts-importer` = project.in(file("."))
  .settings(
    description := "TypeScript importer for Scala.js",
    mainClass := Some("org.scalajs.tools.tsimporter.Main"),
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.2.0-RC1",
      "org.scalatest" %% "scalatest" % "3.2.7" % Test
    )
  )

val samples = project
  .enablePlugins(ScalaJSPlugin)
