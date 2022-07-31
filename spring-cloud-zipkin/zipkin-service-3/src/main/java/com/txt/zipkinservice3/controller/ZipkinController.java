package com.txt.zipkinservice3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
class ZipkinController {

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping(value = "/zipkin3")
    public String zipkinService1() {
        LOG.info("Inside zipkinService 3..");
        String response = (String) restTemplate.exchange("http://localhost:8084/zipkin4",
                HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
            }).getBody();
        return "Hi...";
    }
}
