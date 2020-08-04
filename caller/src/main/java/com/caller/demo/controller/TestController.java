package com.caller.demo.controller;

import com.caller.demo.feignclient.SayHelloCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private SayHelloCaller sayHelloCaller;

    @GetMapping("/aaa")
    public String say() {
            return sayHelloCaller.SayHello();
    }
}
