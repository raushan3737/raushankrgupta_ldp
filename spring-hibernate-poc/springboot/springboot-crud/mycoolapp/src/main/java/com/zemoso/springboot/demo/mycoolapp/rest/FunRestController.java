package com.zemoso.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Giving the default value from application.properties file
    @Value("${welcome.message}")
    private String message;
    @GetMapping("/")
    public String getWebsite() {
        return message;
    }
}
