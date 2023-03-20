package com.yukai.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @Value("${TARGET:World}")
    String target;


    @GetMapping("/")
    public String test(){
        return "Hello " + target + "!";
    }
}
