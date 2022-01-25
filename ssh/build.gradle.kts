plugins {
  id("com.github.android-password-store.android-library")
  id("com.github.android-password-store.kotlin-android")
  id("com.github.android-password-store.kotlin-library")
}

android { sourceSets { getByName("test") { resources.srcDir("src/main/res/raw") } } }

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.kotlin.coroutines.android)
  implementation(libs.kotlin.coroutines.core)
  implementation(libs.thirdparty.sshauth)
  implementation(libs.thirdparty.sshj)
  implementation(libs.androidx.security)
  implementation(libs.thirdparty.eddsa)
}