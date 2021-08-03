package com.zjw.consumer.controller;

import com.zjw.consumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 朱建文
 * @version 1.0
 * @date 2021/7/28 15:33
 * @describe
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String index() {
        return restTemplate.getForObject("http://spring-cloud-producer/hello?name=朱建文111", String.class);
    }

    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/hello1/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
