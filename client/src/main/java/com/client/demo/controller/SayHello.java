package com.client.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @GetMapping("/hello")
    public String SayHello() {
        return "hello1";
    }
}
