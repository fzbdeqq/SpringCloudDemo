package com.snail.filteringbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date: 2020/9/26 22:42
 */
@RestController
public class BookController {
    @GetMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @GetMapping(value = "/checked-out")
    public String checkedOut() {
        return "Spring Boot in Action";
    }
}
