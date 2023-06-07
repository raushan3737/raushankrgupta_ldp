package com.zemoso.annotationdemo.service;

import com.zemoso.annotationdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
