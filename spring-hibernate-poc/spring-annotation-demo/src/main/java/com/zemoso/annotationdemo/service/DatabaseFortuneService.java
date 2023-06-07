package com.zemoso.annotationdemo.service;

import com.zemoso.annotationdemo.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
