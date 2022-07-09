plugins {
  id("com.android.library")
  kotlin("kapt")
}

dependencies {
  implementation(project(":feature:app:domain"))

  implementation(libs.dagger)
  implementation(libs.daggerCompiler)

}
