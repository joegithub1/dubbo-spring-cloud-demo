package com.example.controller;

import com.example.service.impl.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description:
 * @Author huangjian
 * @Date 2022/9/24
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(check = false)
    private UserService userService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return userService.hello(name);
    }
}
