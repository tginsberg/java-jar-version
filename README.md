# Java Jar Self-Version Demo

This repo shows how to determine the vendor, application name, and version of a jar at 
runtime. 

To read more about this, [check out the post I wrote on my blog](https://todd.ginsberg.com/post/what-version-is-this/).

To build:

```shell script
$ ./gradlew clean jar
```

To run the java version:
```shell script
$  java -jar build/libs/self-version-demo-1.0.0-SNAPSHOT.jar
```

To run the kotlin version, add a command line argument:

```shell script
$  java -jar build/libs/self-version-demo-1.0.0-SNAPSHOT.jar kotlin
```

