package com.study.dubbo.producer.service.impl;

import com.study.dubbo.api.service.ProducerHelloService;

/**
 * Created on 2018-05-09
 *
 * @author liuzhaoyuan
 */
public class ProducerHelloServiceImpl implements ProducerHelloService {

    @Override
    public void sayHello() {
        System.out.println("dubbo producer say hello ");
    }
}
