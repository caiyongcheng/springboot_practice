package com.zdww.springbootpractise.annotation.component.service.impl;

import com.zdww.springbootpractise.annotation.component.pojo.User;
import org.springframework.stereotype.Service;

/**
 * springboot-practise
 * 用户业务层
 *
 * @author : CaiYongcheng
 * @date : 2020-07-22 23:06
 **/
@Service(value = "userService")
public class UserServiceImpl implements com.zdww.springbootpractise.annotation.component.service.UserService {
    @Override
    public void printUser(User user) {
        System.out.println(user.toString());
    }
}
