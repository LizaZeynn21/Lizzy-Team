plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.remember_lizzy"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.remember_lizzy"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures{
        viewBinding = true
    }


    buildTypes {
        release {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //fotobulat
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    //View Pager
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    //Glide
    implementation("com.github.bumptech.glide:glide:4.14.2")
    //navigation
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.2")
    //noinspection GradleDependency
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.2")
}