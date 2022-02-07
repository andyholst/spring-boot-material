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
}
