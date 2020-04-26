package com.spring.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class RestControllerHandler {
    @RequestMapping("/test")
    public String testMethod(){
        return "Hello";
    }
}
