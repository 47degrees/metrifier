lazy val V = new {
  lazy val frees    = "0.4.0"
  lazy val freesRPC = "0.1.0"
  lazy val monix    = "3.0.0-M1"
}

lazy val root = project
  .in(file("."))
  .settings(name := "metrifier")
  .aggregate(shared, http, `frees-rpc`, bench)

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
      "io.frees" %% "frees-core"              % V.frees,
      "io.frees" %% "frees-async"             % V.frees,
      "io.frees" %% "frees-async-cats-effect" % V.frees,
      "io.frees" %% "frees-config"            % V.frees,
      "io.frees" %% "frees-logging"           % V.frees,
      "io.frees" %% "frees-rpc"               % V.freesRPC
    )
  )
  .settings(scalaMetaSettings: _*)

lazy val bench = project
  .in(file("bench"))
  .dependsOn(http, `frees-rpc`)
  .settings(moduleName := "bench")
  .settings(scalaMetaSettings: _*)
