package com.sensnow.customized.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSensnow {

    @Value("${server.port}")
    String port;

    @RequestMapping(value="/sensnow")
    public String Hello(@RequestParam String name)
    {
        return "Hello "+name+"! This port is:"+port;
    }
}
