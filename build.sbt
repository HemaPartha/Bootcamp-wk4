name := "bootcamp"

version := "0.1"

scalaVersion := "2.12.8"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.0",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "com.typesafe.akka" %% "akka-stream" % "2.6.8",
  "com.typesafe.akka" %% "akka-actor" % "2.5.24",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.8" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.2.0" % Test
)
