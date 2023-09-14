import kotlin.io.path.absolutePathString
import kotlin.io.path.writeText

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("com.github.jmongard.git-semver-plugin")
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("com.google.firebase.appdistribution") version "4.0.0" apply false

}

val versionNumber = System.getenv("BUILD_NUMBER")?.toInt()?:1
val currentVersion = semver.version
val rpmVersion = semver.version.replace('-','~')

allprojects {
    extra["versionNumber"] = versionNumber
    version  = currentVersion
    extra["semVer"] = currentVersion
    extra["rpmVersion"] = rpmVersion
}

tasks {
    register("versionEnv") {
        doLast {
            val versions = """
                APP_VERSION_NAME=${currentVersion.substringBefore('-')}
                APP_VERSION_CODE=$versionNumber
                RPM_VERSION=$rpmVersion
                VERSION=$currentVersion
            """.trimIndent()
            logger.warn("Version: $versions")
            val path = project.projectDir.toPath().resolve("version.env")
            logger.warn("Writing version in file ${path.absolutePathString()}")
            path.writeText(versions)
        }
    }
}