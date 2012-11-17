import ScalateKeys._

seq(scalateSettings:_*)

scalateTemplateConfig in Compile := Seq(
TemplateConfig(
 file(".") / "src/main/webapp" / "WEB-INF" / "webTmpl",
    Seq(
      "import scala._"
       ),
    Seq(
      Binding("aList", "List[String]", defaultValue = "null")
    )
),
TemplateConfig(
 file(".") / "src/main/webapp" / "WEB-INF" / "mailTmpl",
 Seq(
      "import scala._"
       ),
    Seq(
      Binding("anotherList", "List[String]", defaultValue = "null")
  )
)
)
