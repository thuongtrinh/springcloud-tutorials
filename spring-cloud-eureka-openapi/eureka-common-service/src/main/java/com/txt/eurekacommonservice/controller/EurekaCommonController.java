package com.txt.eurekacommonservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaCommonController {

    @GetMapping(value = "/get-service-name", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getNameService() {
        return "{\"name\" : \"My service is IT system\"}";
    }
}
