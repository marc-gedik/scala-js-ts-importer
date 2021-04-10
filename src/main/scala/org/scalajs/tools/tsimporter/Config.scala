package org.scalajs.tools.tsimporter

case class Config(
    inputFileName: String,
    outputFileName: String,
    packageName: String
)

object Config {
  final val defaultPackageName = "importedjs"
  final val usage = s"""
    Usage: sbt 'run <input.d.ts> <output.scala> [package]'

      <input.d.ts>    TypeScript type definition file to be read
      <output.scala>  Output Scala.js file
      [package]       Package name for the output (defaults to "$defaultPackageName")
   """
  final def parse(args: Array[String]): Option[Config] = {
    if(args.length >= 2) {
      Some(Config(args(0), args(1), args.lift(2).getOrElse(defaultPackageName)))
    } else {
      println(usage)
      None
    }
  }
}
