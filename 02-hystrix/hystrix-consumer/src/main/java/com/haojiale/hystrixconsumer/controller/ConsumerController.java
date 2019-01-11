package com.haojiale.hystrixconsumer.controller;

import com.haojiale.hystrixconsumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author haojiale
 * @Date 2019/01/08 10:47
 * @Version 1.0
 **/
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return helloRemote.hello(name);
    }
}
