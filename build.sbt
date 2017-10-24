lazy val V = new {
  lazy val frees    = "0.4.1"
  lazy val freesRPC = "0.1.1"
  lazy val monix    = "3.0.0-M1"
  lazy val http4sV  = "0.15.12a"
  lazy val argonautV = "6.2"
  lazy val argonautShapelessV = "1.2.0-M5"
}

lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")
  .settings(libraryDependencies ++= http4sAndArgonautDep)

lazy val http = project
  .in(file("http"))
  .dependsOn(shared)
  .settings(moduleName := "http")
  .settings(libraryDependencies ++= http4sAndArgonautDep)
  .dependsOn(shared)

lazy val `frees-rpc` = project
  .in(file("frees-rpc"))
  .dependsOn(shared)
  .settings(moduleName := "frees-rpc")
  .settings(
    libraryDependencies ++= Seq(
      "io.frees" %% "frees-rpc"               % V.freesRPC,
      "io.frees" %% "frees-async-cats-effect" % V.frees
    )
  )
  .settings(scalaMetaSettings: _*)

lazy val bench = project
  .in(file("bench"))
  .dependsOn(http, `frees-rpc`, shared)
  .settings(moduleName := "bench")
  .settings(scalaMetaSettings: _*)
  .settings(libraryDependencies ++= http4sAndArgonautDep)


val http4sAndArgonautDep = Seq(
  "org.http4s" %% "http4s-dsl" % V.http4sV,
  "org.http4s" %% "http4s-blaze-server" % V.http4sV,
  "org.http4s" %% "http4s-blaze-client" % V.http4sV,
  "org.http4s" %% "http4s-argonaut" % V.http4sV,
  "com.github.alexarchambault" %% "argonaut-shapeless_6.2" % V.argonautShapelessV,
  "io.argonaut"  %% "argonaut"              % V.argonautV,
  "io.argonaut"  %% "argonaut-scalaz"       % V.argonautV)
