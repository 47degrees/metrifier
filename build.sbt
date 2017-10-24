lazy val V = new {
  lazy val frees    = "0.4.1"
  lazy val freesRPC = "0.1.1"
  lazy val monix    = "3.0.0-M1"
}

lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")

lazy val http = project
  .in(file("http"))
  .dependsOn(shared)
  .settings(moduleName := "http")

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
  .dependsOn(http, `frees-rpc`)
  .settings(moduleName := "bench")
  .settings(scalaMetaSettings: _*)
