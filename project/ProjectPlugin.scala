import sbt.Keys._
import sbt._
import sbtassembly.AssemblyPlugin
import sbtassembly.AssemblyPlugin.autoImport._

object ProjectPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = AssemblyPlugin

  object autoImport {

    lazy val V = new {
      lazy val frees              = "0.4.1"
      lazy val freesRPC           = "0.2.1-SNAPSHOT"
      lazy val http4sV            = "0.15.12a"
      lazy val argonautV          = "6.2"
      lazy val argonautShapelessV = "1.2.0-M5"
      lazy val config             = "1.3.1"
    }

    lazy val scalaMetaSettings: Seq[Def.Setting[_]] = Seq(
      addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full),
      libraryDependencies += "org.scalameta" %% "scalameta" % "1.8.0",
      scalacOptions += "-Xplugin-require:macroparadise",
      scalacOptions in (Compile, console) ~= (_ filterNot (_ contains "paradise")) // macroparadise plugin doesn't work in repl yet.
    )

    lazy val httpDependencies: Seq[ModuleID] = Seq(
      "org.http4s"                 %% "http4s-dsl"             % V.http4sV,
      "org.http4s"                 %% "http4s-blaze-server"    % V.http4sV,
      "org.http4s"                 %% "http4s-blaze-client"    % V.http4sV,
      "org.http4s"                 %% "http4s-argonaut"        % V.http4sV,
      "com.github.alexarchambault" %% "argonaut-shapeless_6.2" % V.argonautShapelessV,
      "io.argonaut"                %% "argonaut"               % V.argonautV,
      "io.argonaut"                %% "argonaut-scalaz"        % V.argonautV,
      "com.typesafe"               % "config"                  % V.config
    )

    lazy val rpcDependencies: Seq[ModuleID] = Seq(
      "io.frees" %% "frees-rpc"               % V.freesRPC exclude ("org.typelevel", "scala-library"),
      "io.frees" %% "frees-async-cats-effect" % V.frees exclude ("org.typelevel", "scala-library")
    )

    def n(suffix: String) = s"metrifier-$suffix"
  }

  override def projectSettings: Seq[Def.Setting[_]] =
    Seq(
      name := "metrifier",
      organization := "47deg",
      organizationName := "47 Degrees",
      scalaVersion := "2.12.3",
      resolvers ++= Seq(
        Resolver.sonatypeRepo("snapshots"),
        Resolver.sonatypeRepo("releases"),
        Resolver.bintrayRepo("beyondthelines", "maven")
      ),
      test in assembly := {},
      assemblyOption in assembly := (assemblyOption in assembly).value
        .copy(includeScala = false, includeDependency = false),
      assemblyMergeStrategy in assembly := {
        case PathList("javax", "servlet", xs @ _*)                => MergeStrategy.first
        case PathList("META-INF", "io.netty.versions.properties") => MergeStrategy.first
        case PathList(ps @ _*) if ps.last endsWith ".html"        => MergeStrategy.first
        case "application.conf"                                   => MergeStrategy.concat
        case "unwanted.txt"                                       => MergeStrategy.discard
        case x =>
          val oldStrategy = (assemblyMergeStrategy in assembly).value
          oldStrategy(x)
      }
    )

}
