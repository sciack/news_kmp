import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting  {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation(project(":shared"))
            }
        }
    }
}

val semVer: String by extra
val rpmVersion: String by extra

logger.warn("Version semantic $semVer")
logger.warn("Version $version")

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Rpm)
            packageVersion =semVer.substringBefore("-")
            licenseFile.set(File("../LICENSE.txt"))
            packageName = "News"
            linux {
                rpmPackageVersion = rpmVersion
                rpmLicenseType = "Apache-2.0"
                packageVersion =semVer.substringBefore("-")
            }
        }

    }
}
