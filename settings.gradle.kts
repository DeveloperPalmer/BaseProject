include(":core")

enableFeaturePreview("VERSION_CATALOGS")


pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "BaseProject"
include (
    ":app"
)
include(":core:ui")
include(":core:domain")
include(":core:data")
include(":feature")
include(":feature:app")
include(":feature:app:ui")
include(":feature:app:domain")
include(":feature:app:data")
