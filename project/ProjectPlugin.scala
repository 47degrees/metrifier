import sbt.Keys._
import sbt._

object ProjectPlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

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