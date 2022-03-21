# Spring Boot Reactor

## Dependencies
- Docker

## Build and execute tests In Docker

```
docker run --rm -v ${PWD}:/usr/src/spring-reactor gradle:jdk17 bash -c "cd /usr/src/spring-reactor \
&& gradle wrapper --gradle-version 7.3.3 --distribution-type bin"
docker run --rm -v ${PWD}:/usr/src/spring-reactor gradle:jdk17 /usr/src/spring-reactor/gradlew clean build
```