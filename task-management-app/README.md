# task-management-app

## Install dependencies on Linux

```
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install gradle 7.3.1
gradle wrapper --gradle-version 7.3.1 --distribution-type bin
```

## Build application

```
./gradlew assemble
```

## Run tests
```
./gradlew test
```

## Build and run tests

```
./gradlew clean build
```
