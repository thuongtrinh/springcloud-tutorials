package com.txt.cloud.gitintegration.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigGitRemoteController {

    @Value("${user.role:Config Server Git Repo is not working. Please check...}")
    private String role;

    @GetMapping(value = "/get-config-git", produces = MediaType.TEXT_PLAIN_VALUE)
    public String configGitRepo() {
        return String.format("Hello configGitRepo: %s!", role);
    }
}
