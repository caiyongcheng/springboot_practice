package com.zdww.springbootpractise.aop.custom.servise.impl;

import com.zdww.springbootpractise.aop.custom.servise.HelloService;

/**
 * springboot-practise
 * HelloService的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 14:33
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String userName) {
        if (null == userName || userName.length() == 0) {
            throw new RuntimeException("userName is null!!!");
        }
        System.out.println("Hello," + userName);
    }
}
