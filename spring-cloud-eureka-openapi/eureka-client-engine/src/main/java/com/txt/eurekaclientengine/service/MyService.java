package com.txt.eurekaclientengine.service;

import com.txt.eurekaclientengine.feignclient.MyCommonServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyCommonServiceClient myCommonServiceClient;

    public String getServiceName() {
        return myCommonServiceClient.getServiceName();
    }
}
