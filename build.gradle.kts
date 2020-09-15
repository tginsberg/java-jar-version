
plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "com.ginsberg"
version = "1.0.0-SNAPSHOT"

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "com.ginsberg.version.Main",
            "Implementation-Title" to "Todd's Test Application",
            "Implementation-Version" to archiveVersion,
            "Implementation-Vendor" to "Todd Ginsberg"
        )
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}