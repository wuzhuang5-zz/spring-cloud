package com.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wz
 */
@RestController
public class ProducerService {

    @GetMapping("/producer")
    public String sayHello() {
        return "hello world";
    }
}