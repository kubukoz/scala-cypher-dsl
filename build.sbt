val scalaCypherDsl = project
  .in(file("."))
  .settings(
    organization := "com.kubukoz",
    name := "scala-cypher-dsl",
    version := "0.0.0-forked-SNAPSHOT",
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
      "com.chuusai"   %% "shapeless" % "2.3.3",
      "org.scalatest" %% "scalatest" % "3.1.0"
    ),
    scalacOptions -= "-Xfatal-warnings"
  )
