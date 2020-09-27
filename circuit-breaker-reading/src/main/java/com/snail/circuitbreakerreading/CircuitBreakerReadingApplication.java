package com.snail.circuitbreakerreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class CircuitBreakerReadingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerReadingApplication.class, args);
    }

}
