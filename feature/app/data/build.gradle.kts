plugins {
  id("com.android.library")
}


dependencies {
  implementation(project(":core:data"))

  implementation(libs.dagger)
  implementation(libs.daggerCompiler)
}
