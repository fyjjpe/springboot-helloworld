package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjie.fang on 2017/11/16.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "张三");
        map.put("sex", 1);//1 男 2 女
        List<String> userList = new ArrayList<>();
        userList.add("李四");
        userList.add("王五");
        userList.add("赵六");
        map.addAttribute("userList", userList);
        return "index";
    }
}
