plugins {
  id("com.android.library")
}


dependencies {
  implementation(project(":core:domain"))

  implementation(libs.dagger)
  implementation(libs.daggerCompiler)
}
