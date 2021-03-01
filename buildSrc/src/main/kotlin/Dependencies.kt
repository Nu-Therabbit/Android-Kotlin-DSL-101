object Dependencies {
    object Android {
        const val gradleTools = "com.android.tools.build:gradle:4.1.2"
        const val material = "com.google.android.material:material:1.3.0"
    }

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:1.4.31"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

        object Test {
            const val junitExt = "androidx.test.ext:junit:1.1.2"
            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }

    object JUnit {
        private const val version = "4.13.2"
        const val junit = "junit:junit:$version"
    }

    val appLibraries = listOf(
        Kotlin.stdLib, AndroidX.coreKtx, AndroidX.appcompat, AndroidX.constraintLayout,
        Android.material
    )
    val testLibraries = listOf(JUnit.junit)
    val androidTestLibraries = listOf(AndroidX.Test.junitExt, AndroidX.Test.espressoCore)
}