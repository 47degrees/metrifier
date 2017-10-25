lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")

lazy val http = project
  .in(file("http"))
  .dependsOn(shared)
  .aggregate(shared)
  .settings(moduleName := "http")
  .settings(libraryDependencies ++= httpDependencies)

lazy val `frees-rpc` = project
  .in(file("frees-rpc"))
  .dependsOn(shared)
  .aggregate(shared)
  .settings(moduleName := "frees-rpc")
  .settings(libraryDependencies ++= rpcDependencies)
  .settings(scalaMetaSettings: _*)

lazy val demo = project
  .in(file("demo"))
  .dependsOn(http, `frees-rpc`)
  .aggregate(http, `frees-rpc`)
  .settings(moduleName := "demo")
  .settings(scalaMetaSettings: _*)

lazy val bench = project
  .in(file("bench"))
  .dependsOn(http, `frees-rpc`)
  .aggregate(http, `frees-rpc`)
  .settings(moduleName := "bench")
  .settings(scalaMetaSettings: _*)
  .enablePlugins(JmhPlugin)