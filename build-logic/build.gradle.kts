plugins {
    `kotlin-dsl`
}

group = "net.shafraz.orynta.buildlogic"

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.kotlin.composeCompiler.gradlePlugin)
    implementation(libs.compose.gradlePlugin)
}
