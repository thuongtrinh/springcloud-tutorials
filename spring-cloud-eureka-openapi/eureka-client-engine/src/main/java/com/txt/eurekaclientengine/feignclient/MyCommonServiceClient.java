package com.txt.eurekaclientengine.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${micro-service.my-service.name}")
public interface MyCommonServiceClient {

//    @RequestMapping(value = "/get-service-name", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    @GetMapping(value = "/get-service-name")
    String getServiceName();
}
