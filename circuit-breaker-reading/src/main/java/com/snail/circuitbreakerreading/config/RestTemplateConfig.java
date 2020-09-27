package com.snail.circuitbreakerreading.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/27 22:00
 */
@Component
public class RestTemplateConfig {
    @Bean
    public RestTemplate rest(RestTemplateBuilder builder){
        return builder.build();
    }
}
