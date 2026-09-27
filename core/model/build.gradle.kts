plugins {
    id("orynta.kmp.library")
}

kotlin {
    android {
        namespace = "net.shafraz.orynta.core.model"
    }
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:common"))
        }
    }
}
