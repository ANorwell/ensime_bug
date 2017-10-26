lazy val root = project
  .in(file("."))
  .aggregate(a, b)

lazy val a = (project in file("a"))

lazy val b = (project in file("b"))
  .settings(name := "b")
  .settings(
    libraryDependencies ++= {
      Seq()
    }
  )
  .dependsOn(a % "test->test;compile->compile")
