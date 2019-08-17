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

lazy val `demo-common` = project
  .in(file("demo"))
  .dependsOn(shared)
  .settings(moduleName := "demo-common")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)

lazy val `demo-mu` = project
  .in(file("demo/mu"))
  .dependsOn(`demo-common`, `mu-rpc`)
  .aggregate(`demo-common`, `mu-rpc`)
  .settings(moduleName := "demo-mu")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)

lazy val `demo-http` = project
  .in(file("demo/http"))
  .dependsOn(`demo-common`, http)
  .aggregate(`demo-common`, http)
  .settings(moduleName := "demo-http")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)

lazy val `bench-common` = project
  .in(file("bench"))
  .dependsOn(shared)
  .settings(moduleName := "bench-common")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)

lazy val `bench-mu` = project
  .in(file("bench/mu"))
  .dependsOn(`bench-common`, `mu-rpc`)
  .aggregate(`bench-common`, `mu-rpc`)
  .settings(moduleName := "bench-mu")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)
  .enablePlugins(JmhPlugin)

lazy val `bench-http` = project
  .in(file("bench/http"))
  .dependsOn(`bench-common`, http)
  .aggregate(`bench-common`, http)
  .settings(moduleName := "bench-http")
  .settings(name := n(moduleName.value))
  .settings(commonSettings: _*)
  .settings(scalaMetaSettings: _*)
  .enablePlugins(JmhPlugin)