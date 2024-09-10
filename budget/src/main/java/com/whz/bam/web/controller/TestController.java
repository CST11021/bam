package com.whz.bam.web.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author 盖伦
 * @Date 2023/4/18
 */
@RestController
public class TestController {

    @GetMapping("/test-get")
    public String testGet(@RequestParam String bizCode) {
        return bizCode;
    }

    @PostMapping("/test-post")
    public String testPost(@RequestBody String json) {
        return json;
    }

}