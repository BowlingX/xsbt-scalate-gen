import xml.Group

name := "xsbt-scalate-gen"

sbtPlugin := true

ScriptedPlugin.scriptedSettings

libraryDependencies += "org.fusesource.scalate" % "scalate-core" % "1.5.3" % "compile"

scriptedBufferLog := false