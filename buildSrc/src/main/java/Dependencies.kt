object Versions {
    const val compile_sdk = 28
    const val min_sdk = 21
    const val target_sdk = 28

    const val version_code = 1
    const val version_name = "1.0"

    const val x = "1.1.0-alpha01"
    const val material = "1.0.0"
    const val constraint_layout = "1.1.3"
    const val exo_player = "2.9.4"
    const val dagger = "2.21"
    const val paging = "2.1.0"
    const val livedata = "2.0.0"
    const val rxjava = "2.2.2"
    const val rxandroid = "2.1.0"
    const val jetbrains = "16.0.3"
    const val retrofit = "2.5.0"
    const val okhttp = "3.12.0"
    const val glide = "4.8.0"
    const val kotlin_version = "1.3.21"
}

object Libs {
    const val x = "androidx.appcompat:appcompat:${Versions.x}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val recycler_view = "androidx.recyclerview:recyclerview:${Versions.material}"
    const val card_view = "androidx.cardview:cardview:${Versions.material}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val exo_player = "com.google.android.exoplayer:exoplayer:${Versions.exo_player}"
    const val paging = "androidx.paging:paging-common:${Versions.paging}"
    const val paging_runtime = "androidx.paging:paging-runtime:${Versions.paging}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.livedata}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val dagger_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val jetbrains = "org.jetbrains:annotations:${Versions.jetbrains}"
    const val rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glide_okhttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
}