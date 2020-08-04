package com.caller.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client-test")
public interface SayHelloCaller {
    @GetMapping("/hello")
    public String SayHello();
}
