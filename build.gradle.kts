// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.6.0-alpha02")
    }
}
plugins {
    id ("com.android.application") version "7.4.1" apply false
    id ("com.android.library") version "7.4.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.8.0" apply false
}