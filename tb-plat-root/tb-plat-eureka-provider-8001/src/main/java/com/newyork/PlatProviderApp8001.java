package com.newyork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatProviderApp8001 {

    public static void main(String[] args) {
        SpringApplication.run(PlatProviderApp8001.class,args);
    }
}
