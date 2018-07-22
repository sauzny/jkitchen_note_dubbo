package com.sauzny.dubbodemoconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sauzny.dubbodemoapi.DemoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        String result = demoService.sayHello(name);
        log.info(result);
        return result;
    }

}
