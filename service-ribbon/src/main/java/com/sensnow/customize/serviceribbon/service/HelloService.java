package com.sensnow.customize.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    private RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-SENSNOW/sensnow?name=" + name, String.class);
    }


}
