package com.txt.zuulgatwayproxy.controller;

import com.txt.zuulgatwayproxy.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StudentServiceController {

    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name) {
        return "Hello  " + name + " Responsed on : " + new Date();
    }

    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name) {
        return new Student(name, "HCM", "ClassFirst");
    }

}

