package com.study.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created on 2018-05-09
 *
 * @author liuzhaoyuan
 */
@SpringBootApplication
@ImportResource("classpath:spring/spring-dubbo-*.xml")
public class DubboProducerApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboProducerApp.class, args);
        System.out.println();
        System.out.println();
        System.out.println("--------- DubboProducerApp --------");
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
