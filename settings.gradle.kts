pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/nexus/content/repositories/google")
        maven ("https://maven.aliyun.com/nexus/content/groups/public")
        maven("https://maven.aliyun.com/repository/central")
    }
    includeBuild("build-logic")
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/central")
        maven ("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/nexus/content/repositories/google")
        maven ("https://maven.aliyun.com/nexus/content/groups/public")
        maven ("https://jitpack.io")
        maven("https://120.25.164.233:8081/nexus/content/groups/public/")
        maven ("https://repo.eclipse.org/content/repositories/paho-snapshots/")
        mavenCentral()
    }
}

rootProject.name = "AutoX"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":automator")
include(":common")
include(":autojs")
include(":inrt")
include(":apkbuilder")
include(":LocalRepo:libtermexec")
include(":LocalRepo:emulatorview")
include(":LocalRepo:term")
include(":LocalRepo:p7zip")
include(":LocalRepo:OpenCV")
include(":paddleocr")
include(":codeeditor")
include(":core:model")
include(":core:network")