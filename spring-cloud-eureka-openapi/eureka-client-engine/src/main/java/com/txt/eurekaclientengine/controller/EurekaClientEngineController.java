package com.txt.eurekaclientengine.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.txt.eurekaclientengine.service.MyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/v1/clientEngine")
@Tag(name = "EurekaClientEngineController")
public class EurekaClientEngineController {

    @Autowired
    private MyService myService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "EurekaClient Engine")
    public String home() {
        return "{\"hello\" : \"Hello Eureka Client Engine application\"}";
    }

    @GetMapping(value = "/service-name", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get service name")
    public String getMyServiceName() {
        String json = myService.getServiceName();
        String serviceName = null;

        try {
            serviceName = (String) objectMapper.readValue(json, Map.class).get("name");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"service-name\" : \"" + serviceName + "\"}";
    }
}
