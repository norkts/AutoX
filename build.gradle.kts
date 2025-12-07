file("project-versions.json").readLines().forEach(::println)
buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/google")
        maven ("https://maven.aliyun.com/nexus/content/repositories/google")
        maven ("https://maven.aliyun.com/nexus/content/groups/public")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://www.jitpack.io")
    }
    dependencies {
        classpath(libs.groovy.json)
        classpath(libs.andserver)
        classpath(libs.okhttp)
    }
}
plugins{
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.compose) apply false
}

