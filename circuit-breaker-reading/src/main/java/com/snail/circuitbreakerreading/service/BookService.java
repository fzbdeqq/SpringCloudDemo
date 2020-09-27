package com.snail.circuitbreakerreading.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/27 22:05
 */
@Service
public class BookService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "reliable")
    public String readingList() {
        URI uri=URI.create("http://localhost:8091/recommend");
        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reliable(){
        return "Cloud Native Java (O'Reilly)";
    }
}
