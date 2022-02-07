package com.spring.reactor.springreactor.reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoTest {
    @Test
    void firstMono() {
        // Given
        Mono.just("A");

        // When

        // Then
    }

    @Test
    void monoWithConsumer() {
        // Given
        Mono.just("A")
                .log()
                .subscribe(s -> System.out.println(s));

        // When

        // Then
    }

    @Test
    void monoWithDoOn() {
        // Given
        Mono.just("A")
                .log()
                .doOnSubscribe(subscribed -> System.out.println("Subscribed: " + subscribed))
                .doOnRequest(request -> System.out.println("Request: " + request))
                .doOnSuccess(complete -> System.out.println("Complete " + complete))
                .subscribe(System.out::println);

        // When

        // Then
    }
}
