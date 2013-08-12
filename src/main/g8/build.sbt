organization := "com.example"

name := "$name$"

version := "$version$"

ivyXML :=
<dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="3.0.0.v201112011016">
  <artifact name="javax.servlet" type="orbit" ext="jar"/>
</dependency>

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "org.clapper" %% "avsl" % "0.4",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
