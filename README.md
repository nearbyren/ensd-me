# JitPack 步骤

步骤一 项目根目录 build.gradle 添加

```
classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'
```

------------------------------------------------------------------------------------------------------------------------

步骤二 项目module目录 build.gradle 添加

```
plugins {
    //...
    id 'maven-publish'
}
```

```
afterEvaluate {
    publishing {
        publications {
            release(MavenPublication) {
            from components.release
            groupId = 'ejiayou.me.module'
            artifactId = 'me'
            version = '1.0.0'
            }
        }
    }
}
```