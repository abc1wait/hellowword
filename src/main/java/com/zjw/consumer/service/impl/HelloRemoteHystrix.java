package com.zjw.consumer.service.impl;

import com.zjw.consumer.service.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 朱建文
 * @version 1.0
 * @date 2021/8/3 10:30
 * @describe
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
