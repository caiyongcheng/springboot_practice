package com.zdww.springbootpractise.annotation.di.service.impl;

import com.zdww.springbootpractise.annotation.di.dao.UserDao;
import com.zdww.springbootpractise.annotation.di.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * springboot-practise
 * UserService的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-23 11:44
 **/
@Service("userService1")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void useUserDao() {
        System.out.println("使用userService的useUserDao方法");
        userDao.useDao();
    }
}
