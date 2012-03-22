import sbt._

object ScalaInflectorBuild extends Build {


  val root = (Project("scala-inflector", file("."))
              settings(externalResolvers <<= resolvers map { rs => 
                Resolver.withDefaultResolvers(rs, mavenCentral = true, scalaTools = false) 
              })
}

