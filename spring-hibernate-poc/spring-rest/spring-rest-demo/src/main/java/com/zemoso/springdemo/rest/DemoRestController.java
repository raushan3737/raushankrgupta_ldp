package com.zemoso.springdemo.rest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
    private static Logger log = LogManager.getLogger(DemoRestController.class);

    // Add code for the "/help" endpoint
    @GetMapping("/help")
    public String sayHello() {
        log.info("Returning the response of the GET request at /test/help");
        return "Hello, world!";
    }
}
