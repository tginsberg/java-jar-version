package com.ginsberg.version

class KotlinLogVersion {
    fun logVersion() =
        with(javaClass.`package`) {
            println("Application: $implementationTitle, version: $implementationVersion, by $implementationVendor")
        }
}