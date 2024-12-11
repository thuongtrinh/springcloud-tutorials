package com.txt.cloud.gitintegration.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigLocalPathController {

    @Value("${msg:Config Server local path is not working. Please check...}")
    private String msg;

    @Value("${text.copyright: Config Server local path is not working. Please check... Default Copyright}")
    private String copyright;

    @GetMapping("/local/msg")
    public String getMsg() {
        return this.msg;
    }

    @GetMapping("/local/copyright")
    public String getCopyRight() {
        return this.copyright;
    }

}
