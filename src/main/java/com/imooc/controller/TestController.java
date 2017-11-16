package com.imooc.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@RestController
//@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "SUCCESS";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(TestController.class, args);
//    }


    @RequestMapping("/test2")
    public String test2() {
        int i = 1 / 0;
        return "test2";
    }
}
