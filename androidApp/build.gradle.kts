plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
    id("com.google.gms.google-services")
    id("com.google.firebase.appdistribution")

}

kotlin {
    androidTarget()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation(platform("com.google.firebase:firebase-bom:32.2.3"))
                implementation("com.google.firebase:firebase-analytics-ktx")
                implementation("com.google.firebase:firebase-auth")
                implementation("com.google.firebase:firebase-firestore")
            }
        }
    }
}

val versionNumber: Int by extra

logger.warn("Version number $versionNumber")
logger.warn("Version $version")

android {
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
    namespace = "com.myapplication"

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        applicationId = "com.github.sciack.news"
        minSdk = (findProperty("android.minSdk") as String).toInt()
        targetSdk = (findProperty("android.targetSdk") as String).toInt()
        versionCode = versionNumber
        versionName = "$version"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }

    buildTypes {
        getByName("release") {
            firebaseAppDistribution {
                artifactType = "APK"
                releaseNotesFile = "./releaseNotes.txt"
                testers = "m.sciachero@gmail.com"
            }
        }
    }

}
