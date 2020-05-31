package com.springlab.springboot.oauth2.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome1")
    public String greeting(){
        return "Welcome to spring boot application!!!";
    }

    @GetMapping("/welcome")
    public String sayHello(){
        return "Public api!!!";
    }
}
