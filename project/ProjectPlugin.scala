import sbt.Keys.{scalacOptions, _}
import sbt._
import sbtassembly.AssemblyPlugin
import sbtassembly.AssemblyPlugin.autoImport._

object ProjectPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = AssemblyPlugin

  object autoImport {

    lazy val V = new {
      lazy val freesRPC = "0.15.1"
      lazy val http4s   = "0.21.28"
      lazy val config   = "1.4.1"
      lazy val logback  = "1.2.3"
      lazy val circe    = "0.13.0"
    }

    lazy val commonSettings: Seq[Def.Setting[_]] = Seq(
      libraryDependencies += "ch.qos.logback" % "logback-classic" % V.logback,
      scalacOptions ++= Seq(
        "-deprecation",
        "-feature",
        "-unchecked",
        "-language:higherKinds",
        "-Ypartial-unification"
      )
    )

    lazy val scalaMetaSettings: Seq[Def.Setting[_]] = Seq(
      addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full),
      scalacOptions ++= Seq("-Xplugin-require:macroparadise"),
      scalacOptions in (Compile, console) ~= (_ filterNot (_ contains "paradise")) // macroparadise plugin doesn't work in repl yet.
    )

    lazy val httpDependencies: Seq[ModuleID] = Seq(
      "org.http4s"  %% "http4s-dsl"          % V.http4s,
      "org.http4s"  %% "http4s-blaze-server" % V.http4s,
      "org.http4s"  %% "http4s-blaze-client" % V.http4s,
      "org.http4s"  %% "http4s-argonaut"     % V.http4s,
      "org.http4s"  %% "http4s-circe"        % V.http4s,
      "io.circe"    %% "circe-generic"       % V.circe,
      "com.typesafe" % "config"              % V.config
    )

    lazy val rpcDependencies: Seq[ModuleID] = Seq(
      "io.frees" %% "frees-rpc-server"      % V.freesRPC,
      "io.frees" %% "frees-rpc-client-core" % V.freesRPC,
      "io.frees" %% "frees-rpc-config"      % V.freesRPC
    )

    def n(suffix: String) = s"metrifier-$suffix"
  }

  override def projectSettings: Seq[Def.Setting[_]] =
    Seq(
      name := "metrifier",
      organization := "47deg",
      organizationName := "47 Degrees",
      scalaVersion := "2.12.6",
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
