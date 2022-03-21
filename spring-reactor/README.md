# Spring Boot Reactor

## Requirements
- Docker

## Build and execute tests In Docker

```
# Prepare environment
docker run --rm -v ${PWD}:/usr/src/spring-reactor gradle:jdk17 bash -c "cd /usr/src/spring-reactor \
&& gradle wrapper --gradle-version 7.3.3 --distribution-type bin"

# Build and run tests 
docker run --rm -v ${PWD}:/usr/src/spring-reactor gradle:jdk17 bash -c "cd /usr/src/spring-reactor \
&& ./gradlew clean build"
```