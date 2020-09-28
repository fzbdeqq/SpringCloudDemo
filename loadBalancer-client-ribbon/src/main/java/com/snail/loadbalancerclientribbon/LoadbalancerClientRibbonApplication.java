package com.snail.loadbalancerclientribbon;

import com.snail.loadbalancerclientribbon.config.SayHelloConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "say-hello",configuration = SayHelloConfiguration.class)
public class LoadbalancerClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadbalancerClientRibbonApplication.class, args);
    }

}
