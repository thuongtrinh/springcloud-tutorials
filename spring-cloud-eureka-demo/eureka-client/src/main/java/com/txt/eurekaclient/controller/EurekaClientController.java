package com.txt.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    @RequestMapping(value = "/")
    public String home() {
        return "Eureka Client application";
    }
}
