package com.snail.configurationclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/25 21:41
 */
@RestController
@RefreshScope
public class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    @GetMapping("/message")
    String getMessage(){
        return this.message;
    }
}
