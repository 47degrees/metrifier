lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")

lazy val http = project
  .in(file("http"))
  .dependsOn(shared)
  .settings(moduleName := "http")
  .settings(libraryDependencies ++= httpDependencies)
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
  .settings(libraryDependencies ++= httpDependencies)
