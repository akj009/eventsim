name := "eventsim"

version := "1.0"

scalaVersion := "2.13.1"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

scalacOptions += "-target:8"
scalacOptions += "-language:postfixOps"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "de.jollyday" % "jollyday" % "0.5.10"

libraryDependencies += "org.rogach" %% "scallop" % "3.4.0"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.6.1"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.1"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.2.1"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
