package com.fpt.thangphan.recruitment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ContextStorage {

    @Bean("loginData")
    public Map<String, String> createLoginDataContext() {
//        <IP, username>
        Map<String, String> loginData = new HashMap<>();
        return loginData;
    }
}
