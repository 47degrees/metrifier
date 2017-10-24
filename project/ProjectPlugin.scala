import sbt.Keys._
import sbt._

object ProjectPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  object autoImport {

    lazy val scalaMetaSettings: Seq[Def.Setting[_]] =
      Seq(
        addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full),
        libraryDependencies += "org.scalameta" %% "scalameta" % "1.8.0",
        scalacOptions += "-Xplugin-require:macroparadise",
        scalacOptions in (Compile, console) ~= (_ filterNot (_ contains "paradise")) // macroparadise plugin doesn't work in repl yet.
      )

  }

  override def projectSettings: Seq[Def.Setting[_]] =
    Seq(
      name := "metrifier",
      organization := "47deg",
      organizationName := "47 Degrees",
      scalaVersion := "2.12.3",
      resolvers ++= Seq(
        Resolver.sonatypeRepo("releases"),
        Resolver.bintrayRepo("beyondthelines", "maven")
      )
    )

}
