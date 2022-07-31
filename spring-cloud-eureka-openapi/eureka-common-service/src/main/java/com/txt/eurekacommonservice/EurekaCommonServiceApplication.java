package com.txt.eurekacommonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaCommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCommonServiceApplication.class, args);
    }
}
