pluginManagement {
    repositories {
        mavenCentral()
        maven(url = "https://repo.elytradev.com/") {
            name = "elytradev"
        }
        maven(url = "https://kotlin.bintray.com/kotlinx") {
            name = "kotlinX"
        }
        gradlePluginPortal()
    }
}
rootProject.name = "Center-of-the-Multiverse"
