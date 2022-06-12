plugins {
    id ("com.android.application")
    kotlin ("android")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.sla.baseproject"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled =  false
            proguardFiles (
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-beta03"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    namespace = "com.sla.baseproject"
}

dependencies {
    implementation (libs.androidXCore)
    implementation (libs.androidXCoreKtx)
    implementation (libs.activityCompose)

    api(libs.bundles.androidUiLibs)
    api(libs.bundles.lifecycleLibs)
}