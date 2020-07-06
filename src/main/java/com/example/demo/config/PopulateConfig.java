package com.example.demo.config;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PopulateConfig {
    @Autowired UserService userService;

    @PostConstruct
    public void init() {
        userService.init();
    }
}
