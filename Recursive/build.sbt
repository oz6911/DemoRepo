import Dependencies._

val log4j			= "log4j" % "log4j" % "1.2.17" exclude("javax.jms", "jms")
val spark			= "org.apache.spark" %% "spark-core" % "1.3.1" % "provided"

lazy val root = (project in file(".")).
  settings(
		organization := "com.ozconsulting",
		scalaVersion := "2.11.8",
		version      := "0.1.0",
		name := "Recursive",
		libraryDependencies	+= log4j,
		libraryDependencies	+= spark,		
  )
