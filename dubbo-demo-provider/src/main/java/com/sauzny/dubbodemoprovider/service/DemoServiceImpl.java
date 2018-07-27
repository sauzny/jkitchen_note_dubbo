package com.sauzny.dubbodemoprovider.service;

import org.springframework.stereotype.Service;

import com.sauzny.dubbodemoapi.DemoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        String result = "Hello, " + name + " (from Spring Boot)";
        log.info("provider result : {}", result);
        return result;
    }

}