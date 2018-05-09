package com.study.dubbo.producer.controller;

import com.study.dubbo.api.service.ProducerHelloService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018-05-09
 *
 * @author liuzhaoyuan
 */
@RestController
public class ProducerController {

    @Autowired
    private ProducerHelloService producerHelloService;

    @GetMapping("/")
    public String index() {
        return "dubbo producer index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "dubbo producer hello " + LocalDateTime.now();
    }


    @GetMapping("/say")
    public String say(){
        producerHelloService.sayHello();
        return "success";
    }
}
