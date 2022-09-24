package com.example.service.impl;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @ClassName UserServiceImpl
 * @Description:
 * @Author huangjian
 * @Date 2022/9/24
 **/
@DubboService
public class UserServiceImpl implements UserService{
    @Override
    public String hello(String name) {
        return "hello world "+name;
    }
}
