package com.example.controller;

import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zurichscud
 * @Date: 2023/9/27 9:16
 * @Description: TODO
 */
@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping("/demo1")
    public String demo1() {
        return "this is demo1";
    }

    @ResponseBody
    @RequestMapping("/demo2")
    public String demo2() {
        return "this is demo2";
    }
    @ResponseBody
    @RequestMapping("/demo3")
    public Object demo3(@Validated @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            //返回Json格式字符串
            Map<String,String> res =new HashMap<>();
            res.put("code","400");
            res.put("msg","校验失败");
            return res;
        }
        System.out.println(user);
        return user;
    }
}
