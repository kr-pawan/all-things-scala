name := "all-things-scala"
organization := "com.bynaar.myorg"

version := "0.1"

scalaVersion := "2.13.3"

lazy val akkaVersion = "2.6.8"
lazy val akkaHttpVersion = "10.2.0"
lazy val scalaCacheVersion = "0.28.0"
lazy val circeVersion = "0.12.3"

resolvers += "Confluent Repo" at "https://packages.confluent.io/maven"

libraryDependencies ++=
  (typesafeConfig :: scalaTest :: apacheCommons :: scalaCache :: javaScalaFutureConverterOnly ::
    kafka :: confluentSerde :: avro4S :: pureConfig :: caskHttp :: scalaAsync :: Nil) ++:
    logging ++: akka ++: akkaHttp ++: akkaTest ++: scalaCacheSerde

lazy val typesafeConfig = "com.typesafe" % "config" % "1.4.0"
lazy val logging = "ch.qos.logback" % "logback-classic" % "1.2.3" :: "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2" :: Nil
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.0" % Test
lazy val apacheCommons = "org.apache.commons" % "commons-lang3" % "3.11"
lazy val akka = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion :: "com.typesafe.akka" %% "akka-stream" % akkaVersion :: "com.typesafe.akka" %% "akka-stream" % akkaVersion :: Nil
lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion :: "com.typesafe.akka" %% "akka-http-jackson" % akkaHttpVersion :: "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion :: "ch.megard" %% "akka-http-cors" % "1.1.0" :: Nil
lazy val akkaTest = "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test :: "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test :: "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test :: Nil
lazy val mySql = "mysql" % "mysql-connector-java" % "8.0.21"
lazy val slick = ("com.typesafe.slick" %% "slick" % "3.3.2" withSources()) :: "com.typesafe.slick" %% "slick-hikaricp" % "3.3.2" :: Nil
lazy val akkaSlickStream = "com.lightbend.akka" %% "akka-stream-alpakka-slick" % "2.0.1"
lazy val scalaCache = "com.github.cb372" %% "scalacache-memcached" % scalaCacheVersion
lazy val javaScalaFutureConverterOnly = "org.jboss.netty" % "netty" % "3.2.10.Final" //Used for Java to Scala Future converter
lazy val scalaCacheSerde = "io.circe" %% "circe-core" % circeVersion :: "io.circe" %% "circe-generic" % circeVersion :: "io.circe" %% "circe-parser" % circeVersion :: Nil
lazy val kafka = "org.apache.kafka" %% "kafka" % "2.6.0" withSources() withJavadoc()
lazy val confluentSerde = "io.confluent" % "kafka-streams-avro-serde" % "5.5.0"
lazy val avro4S = "com.sksamuel.avro4s" %% "avro4s-core" % "4.0.0"
lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.12.3"
lazy val caskHttp = "com.lihaoyi" %% "cask" % "0.6.7"
lazy val scalaAsync = "org.scala-lang.modules" % "scala-async_2.13" % "1.0.1"
lazy val katancsv = "com.nrinaudo" %% "kantan.csv-generic" % "0.6.1" :: "com.nrinaudo" %% "kantan.csv-java8" % "0.6.1" :: "com.nrinaudo" %% "kantan.csv-enumeratum" % "0.6.1" :: Nil
