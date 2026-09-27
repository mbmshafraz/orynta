plugins {
    id("orynta.cmp.library")
}

kotlin {
    android {
        namespace = "net.shafraz.orynta.core.designsystem"
    }
    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:common"))
        }
    }
}
