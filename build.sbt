lazy val V = new {
  lazy val frees    = "0.4.0"
  lazy val freesRPC = "0.1.0"
  lazy val monix    = "3.0.0-M1"
}

lazy val root = project
  .in(file("."))
  .settings(name := "metrifier")
  .aggregate(shared, http/*, `frees-rpc`*/, bench)
  .dependsOn(shared, http/*, `frees-rpc`*/, bench)

lazy val shared = project
  .in(file("shared"))
  .settings(moduleName := "shared")

lazy val http = project
  .in(file("http"))
  .settings(moduleName := "http")

lazy val `frees-rpc` = project
  .in(file("frees-rpc"))
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
  .settings(
    Seq(
      addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full),
      libraryDependencies += "org.scalameta" %% "scalameta" % "1.8.0",
      scalacOptions += "-Xplugin-require:macroparadise",
      scalacOptions in (Compile, console) ~= (_ filterNot (_ contains "paradise")) // macroparadise plugin doesn't work in repl yet.
    ): _*
  )

lazy val bench = project
  .in(file("bench"))
  .settings(moduleName := "bench")
