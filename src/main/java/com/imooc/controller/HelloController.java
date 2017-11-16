package com.imooc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello2")
    public String hell2(){
        return "hello2";
    }
}
