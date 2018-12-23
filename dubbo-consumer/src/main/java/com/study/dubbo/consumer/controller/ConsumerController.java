package com.study.dubbo.consumer.controller;

import com.study.dubbo.api.dto.User;
import com.study.dubbo.api.service.ProducerHelloService;
import com.study.dubbo.api.service.UserService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018-05-09
 *
 * @author liuzhaoyuan
 */
@RestController
public class ConsumerController {

    @Autowired
    private ProducerHelloService producerHelloService;

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index() {
        return "dubbo consumer index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "dubbo consumer hello " + LocalDateTime.now();
    }

    @GetMapping("/say")
    public String consumer() {
        producerHelloService.sayHello();
        return "success " + LocalDateTime.now();
    }

    @GetMapping("/user/{id}")
    public User user(@PathVariable("id") Integer id) {

        return userService.findUserById(id);
    }

}
