plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    id("com.github.jmongard.git-semver-plugin")
    id("com.google.gms.google-services") version "4.3.15" apply false
}

val versionNumber =
    with(semver.semVersion) {
        major * 10_000 + minor * 100 + patch
    }
val currentVersion = semver.version

allprojects {
    extra["versionNumber"] = versionNumber
    version  = currentVersion

}