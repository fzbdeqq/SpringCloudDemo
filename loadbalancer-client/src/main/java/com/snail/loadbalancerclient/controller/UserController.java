package com.snail.loadbalancerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 21:13
 */
@RestController
public class UserController {
    @Autowired
    private WebClient.Builder webClient;
    @Autowired
    private ReactorLoadBalancerExchangeFilterFunction lbFunction;
    @GetMapping("/hi")
    public Mono<String> hi(String name){
        return webClient.build().get().uri("http://say-hello/greeting").retrieve()
                .bodyToMono(String.class)
        .map(greeting->String.format("%s,%s", greeting,name));
    }

    @GetMapping("/hello")
    public Mono<String> hello(String name){
        return WebClient.builder()
                .filter(lbFunction)
                .build()
                .get().uri("http://say-hello/greeting")
                .retrieve()
                .bodyToMono(String.class)
                .map(greeting->String.format("%s,%s", greeting,name));
    }

}
