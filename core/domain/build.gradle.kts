plugins {
    id("orynta.kmp.library")
}

kotlin {
    android {
        namespace = "net.shafraz.orynta.core.domain"
    }
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:common"))
            implementation(project(":core:model"))
        }
    }
}
