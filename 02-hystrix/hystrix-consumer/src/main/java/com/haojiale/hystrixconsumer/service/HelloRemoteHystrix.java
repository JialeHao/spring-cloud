package com.haojiale.hystrixconsumer.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author haojiale
 * @Date 2019/01/09 15:57
 * @Version 1.0
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
