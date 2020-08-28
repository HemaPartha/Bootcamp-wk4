name := "AkkaHttp"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.0-M1",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.0-RC2",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.3" % "test",
  "com.typesafe.akka" %% "akka-stream" % "2.6.2",
  "com.typesafe.akka" %% "akka-actor" % "2.5.24"
)
