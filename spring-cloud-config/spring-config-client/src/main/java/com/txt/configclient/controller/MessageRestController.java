package com.txt.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

    @Value("${msg:Config Server is not working. Please check...}")
    private String msg;

    @Value("${text.copyright: Config Server is not working. Please check... Default Copyright}")
    private String copyright;

    @GetMapping("/msg")
    public String getMsg() {
        return this.msg;
    }

    @GetMapping("/copyright")
    public String getCopyRight() {
        return this.copyright;
    }
}
