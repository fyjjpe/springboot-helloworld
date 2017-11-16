package com.imooc.controller;

import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String addUser() {
        userService.createJdbcUser();
        return "add success";
    }
}
