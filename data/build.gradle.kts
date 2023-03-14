plugins {
    id ("org.jetbrains.kotlin.android")
    id ("com.android.library")
    id ("kotlin-kapt")
}

android {
    namespace = "com.app.data"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk  = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk

        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = AppConfig.jvmTaget
        }
    }
}

dependencies {

    hilt()

}
