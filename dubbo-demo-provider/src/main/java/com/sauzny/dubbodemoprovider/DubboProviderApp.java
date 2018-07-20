package com.sauzny.dubbodemoprovider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProviderApp {
    public static void main(String[] args) {
        
        new SpringApplicationBuilder(DubboProviderApp.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);
    }
}
