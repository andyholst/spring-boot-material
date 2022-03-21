# Spring Boot Reactor

## Dependencies
- Docker

## Build and execute tests In Docker

```
docker run --rm -v ${PWD}:/usr/src/spring-reactor gradle:jdk17 /usr/src/spring-reactor/gradlew clean build
```