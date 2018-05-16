package com.hainet.spring.boot.shutdown.sample;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@Configuration
public class ShutdownConfig {

    @PreDestroy
    public void onDestroy() {
        System.out.println("Spring Container is destroyed!");
    }
}
