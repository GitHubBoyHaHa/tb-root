package com.newyork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp8848 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp8848.class);
    }
}
