lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")
  .settings(name := n(moduleName.value))

lazy val http = project
  .in(file("http"))
  .dependsOn(shared)
  .aggregate(shared)
  .settings(moduleName := "http")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= httpDependencies)

lazy val `mu-rpc` = project
  .in(file("mu-rpc"))
  .dependsOn(shared)
  .aggregate(shared)
  .settings(moduleName := "mu-rpc")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(libraryDependencies ++= rpcDependencies)
  .settings(scalaMetaSettings: _*)

lazy val demo = project
  .in(file("demo"))
  .dependsOn(http, `mu-rpc`)
  .aggregate(http, `mu-rpc`)
  .settings(moduleName := "demo")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)

lazy val bench = project
  .in(file("bench"))
  .dependsOn(http, `mu-rpc`)
  .aggregate(http, `mu-rpc`)
  .settings(moduleName := "bench")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)
  .enablePlugins(JmhPlugin)