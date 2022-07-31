package com.txt.eurekaclientengine.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/v1/authen")
@Tag(name = "Client Controller")
public class AuthenController {

    private Log log = LogFactory.getLog(this.getClass());

    @GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Login client")
    public String client01() {
        return "{\"data\" : \"Login client\"}";
    }
}
