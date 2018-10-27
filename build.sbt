libraryDependencies ++= Seq(
  //  "org.graalvm.sdk" % "graal-sdk" % "1.0.0-rc8" % "provided",
  //  "org.graalvm.truffle" % "truffle-api" % "1.0.0-rc8" % "provided",
  //  "org.graalvm.js" % "js" % "1.0.0-rc8" % "provided"
  "org.graalvm.sdk" % "graal-sdk" % "1.0.0-rc8",
  "org.graalvm.truffle" % "truffle-api" % "1.0.0-rc8",
  "org.graalvm.js" % "js" % "1.0.0-rc8"
)

//enablePlugins(GraalVMNativeImagePlugin)
//graalVMNativeImageOptions += "--report-unsupported-elements-at-runtime"
//graalVMNativeImageOptions += "--language:js"

