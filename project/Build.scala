import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "subroutes"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(

  ).dependsOn(
    module1, module2
  ).aggregate(
    module1, module2
  )

  lazy val module1   : Project = play.Project(appName + "-module1", appVersion, appDependencies, path = file("modules") / "module1")
  lazy val module2   : Project = play.Project(appName + "-module2", appVersion, appDependencies, path = file("modules") / "module2").dependsOn( module1 )

}
