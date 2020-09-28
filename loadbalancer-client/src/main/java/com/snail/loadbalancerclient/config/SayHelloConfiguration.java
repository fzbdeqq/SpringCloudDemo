package com.snail.loadbalancerclient.config;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 21:23
 */
@Configuration
public class SayHelloConfiguration {
    @Bean
    @Primary
    ServiceInstanceListSupplier serviceInstanceListSupplier(){
        return new DemoServiceInstanceListSuppler("say-hello");
    }
}

