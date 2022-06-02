# Shell app with jBang
## Running the shell
There are two ways to run the app:
1. Executing main java file:
```shell
chmod +x Main.java
./Main.java
```
2. Using jbang:
```shell
jbang Main.java
```

## Building JAR file
This creates `Main.jar` file with `lib` folder with dependencies.
```shell
jbang export portable Main.java
```

## Building native image from JAR file and `lib` using GraalVM
To building native image first build portable JAR file. Then convert it to native with GraalVM.
```shell
$GRAALVM_HOME/bin/native-image -jar Main.jar MainApp -cp lib
```