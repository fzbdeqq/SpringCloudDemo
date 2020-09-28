package com.snail.loadbalancerclientribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/28 22:28
 */
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    private String hi(String name){
        String greeting=restTemplate.getForObject("http://localhost:8090/greeting", String.class);
        return String .format("%s,%s", greeting,name);
    }
    @GetMapping("/hi1")
    private String hi1(String name){
        String greeting=restTemplate.getForObject("http://say-hello/greeting", String.class);
        return String .format("%s,%s", greeting,name);
    }

}
