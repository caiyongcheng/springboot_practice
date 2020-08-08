package com.zdww.springbootpractise.aop.spring_annotation.service.impl;

import com.zdww.springbootpractise.aop.spring_annotation.pojp.User;
import com.zdww.springbootpractise.aop.spring_annotation.service.HelloService;

/**
 * springboot-practise
 * HelloService的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 14:33
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(User user) throws Exception {
        if (user == null ) {
            throw new Exception("user为空!!!");
        }
        System.out.println(user.toString());
    }




}
