package com.youzan.demo.serviceImpl;

import com.youzan.demo.service.HelloService;

/**
 * Created by zhouxuan on 2018/2/5.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
