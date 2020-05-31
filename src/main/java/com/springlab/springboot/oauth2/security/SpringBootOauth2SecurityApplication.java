package com.springlab.springboot.oauth2.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringBootOauth2SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOauth2SecurityApplication.class, args);
    }

}
