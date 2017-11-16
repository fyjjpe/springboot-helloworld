package com.imooc.service.impl;

import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createJdbcUser() {
        jdbcTemplate.update("INSERT INTO user VALUES (null,?,?);", "lisi", 19);
    }
}
