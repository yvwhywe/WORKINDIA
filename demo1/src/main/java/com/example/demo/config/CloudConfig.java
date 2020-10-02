package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CloudConfig {

    // Create a RestTemplate Bean
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}