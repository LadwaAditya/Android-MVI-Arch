object Versions {
    
    //Android
    const val buildToolsVersion = "27.0.3"
    const val minSdkVersion = 19
    const val targetSdkVersion = 27
    const val compileSdkVersion = 27
    
    //Kotlin
    const val kotlin = "1.2.21"
    
    //Rx
    const val rxJava = "2.1.5"
    const val rxAndroid = "2.0.1"
    
    const val retrofit = "2.3.0"
    const val okhttp = "3.9.1"
    const val okhttpLogging = "3.9.0"
    const val gson = "2.3.0"
    
    const val arch = "1.0.0"
    
    const val dagger = "2.13"
}

object Deps {
    //Kotlin
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    
    //RxJava
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    
    //Network
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val gson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
    
    //Architecture components
    val lifeCycle = "android.arch.lifecycle:extensions:${Versions.arch}"
    val room = "android.arch.persistence.room:runtime:${Versions.arch}"
    val roomRx = "android.arch.persistence.room:rxjava2:${Versions.arch}"
    val roomCompiler = "android.arch.persistence.room:compiler:${Versions.arch}"
    
    //Dagger
    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val javax = "org.glassfish:javax.annotation:10.0-b28"
    val javaxInject = "javax.inject:javax.inject:1"
    val javaxAnnotation = "javax.annotation:jsr250-api:1.0"
}