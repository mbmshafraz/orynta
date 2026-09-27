plugins {
    id("orynta.kmp.library")
}

kotlin {
    android {
        namespace = "net.shafraz.orynta.core.data"
    }
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:common"))
            implementation(project(":core:model"))
            implementation(project(":core:domain"))
            implementation(project(":core:database"))
            implementation(project(":core:network"))
        }
    }
}
