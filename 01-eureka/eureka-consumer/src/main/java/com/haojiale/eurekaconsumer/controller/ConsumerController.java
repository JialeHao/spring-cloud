package com.haojiale.eurekaconsumer.controller;

import com.haojiale.eurekaconsumer.service.HelloRemote;
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
