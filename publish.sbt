credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credentials")

ThisBuild / organization := "com.github.rssh"
ThisBuild / organizationName := "rssh"
ThisBuild / organizationHomepage := Some(url("https://github.com/rssh"))

ThisBuild / scmInfo := Some(
       ScmInfo(
          url("https://github.com/rssh/dotty-cps-async"),
          "scm:git@github.com:rssh/dotty-cps-async.git"
       )
)


ThisBuild / developers := List(
          Developer(
             id    = "rssh",
             name  = "Ruslan Shevchenko",
             email = "ruslan@shevchenko.kiev.ua",
             url   = url("https://github.com/rssh")
          )
)


ThisBuild / description := "async/await macros based on optimised monadic cps transform"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/rssh/dotty-cps-async"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
       val nexus = "https://oss.sonatype.org/"
       if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
       else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true




