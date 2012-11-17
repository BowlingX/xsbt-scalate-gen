import sbt._
import Keys._
import scala.xml.Group

object ScalateGenerateBuild extends Build {

  /**
   * Default Build Settings, for all subprojects
   */ 
  val buildSettings = Defaults.defaultSettings ++ Seq(

    scalaVersion      := "2.9.2",
    version           := "0.1.0-SNAPSHOT",
    organization      := "com.mojolly.scalate",
    publishMavenStyle := false

  ) ++ credentialSetting

  lazy val credentialSetting = credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
}


  // Define Root Project (this Plugin)
  lazy val root = Project(id="xsbt-scalate-gen", base = file("."),
    settings = buildSettings)
  // Define all Projects
  override def projects = Seq(root)

}
