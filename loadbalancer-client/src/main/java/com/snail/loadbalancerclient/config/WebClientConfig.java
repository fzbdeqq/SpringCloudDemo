package com.snail.loadbalancerclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 21:22
 */
@Configuration
@LoadBalancerClient(name = "say-hello",configuration = SayHelloConfiguration.class)
public class WebClientConfig {
    @LoadBalanced
    @Bean
    WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }

}
