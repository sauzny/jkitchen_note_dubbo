package com.sauzny.dubbodemoconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sauzny.dubbodemoapi.DemoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoConsumerController {
    
    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        String result = demoService.sayHello(name);
        log.info("from provider result : {}", result);
        return result;
    }

}
