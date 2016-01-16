# HelloJni

## Description

Learn use of NDK

## Reference

Forked from https://github.com/googlesamples/android-ndk/tree/master/hello-jni

## Guide

1 �� `gradle.properties` �������������ݣ�
```xml
android.useDeprecatedNdk=true
```

2 �޸� `app\build.gradle`
```xml
android {
    compileSdkVersion 23
    buildToolsVersion "23.0.2"

    defaultConfig {
        applicationId "cn.sopho.destiny.hellojni"
        minSdkVersion 15
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
`        ndk {`
`            moduleName = "HelloJni"`
`        }`
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
`    sourceSets {`
`        main {`
`            jniLibs.srcDirs = ['libs']`
`        }`
`    }`
}
```

3 mkdir app\src\main\jni

4 �� `app\src\main\jni` ������ļ� `helloJni.c` �� `helloJni.h`

## Screenshot

<img src="https://github.com/xj107359/HelloJni/blob/master/Screenshot/screen01.png" alt="screenshot" width="auto" height="auto" />
