package com.sensnow.customized.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSensnow {

    @RequestMapping(value="/")
    public String Hello()
    {
        return "Hello Sensnow!";
    }
}
