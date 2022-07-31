package com.txt.apigateway.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "employee-service", url = "http://localhost:8011")
//@FeignClient(name = "${micro-service.employee-service.name}")
public interface StudentFeign {

    @GetMapping(value = "/getEmployees")
    String getEmployeeList();
}
