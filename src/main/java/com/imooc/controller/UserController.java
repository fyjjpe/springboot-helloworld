package com.imooc.controller;

import com.imooc.entity.UserEntity;
import com.imooc.mapper.UserMapper;
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

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public String addUser() {
        userService.createJdbcUser();
        return "add success";
    }

    @RequestMapping("/getUsername")
    public UserEntity getUsername(String name) {
        return userMapper.findName(name);
    }

    @RequestMapping("/addUser")
    public int addUser(String name, int age) {
        return userMapper.addUser(name, age);
    }
}
