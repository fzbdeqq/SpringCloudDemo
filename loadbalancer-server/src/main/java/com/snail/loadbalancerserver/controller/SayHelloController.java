package com.snail.loadbalancerserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 21:01
 */
@RestController
@Slf4j
public class SayHelloController {

    @GetMapping("/greeting")
    public String greet(){
        log.info("Access /greeting");
        List<String> greetings= Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand=new Random();
        int randomNum=rand.nextInt(greetings.size());
        return greetings.get(randomNum);
    }
    @GetMapping("/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }
}
