package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class HelloHandler {

    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/index")
    public String index(){
        return "当前端口："+this.port;
    }

}
