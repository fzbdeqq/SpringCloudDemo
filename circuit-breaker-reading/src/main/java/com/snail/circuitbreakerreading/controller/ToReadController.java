package com.snail.circuitbreakerreading.controller;

import com.snail.circuitbreakerreading.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/27 22:01
 */
@RestController
public class ToReadController {
    @Autowired
    private BookService bookService;

    @GetMapping("/to-read")
    public String toRead(){
        return bookService.readingList();
    }
}
