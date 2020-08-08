package com.zdww.springbootpractise.annotation.di.dao.impl;

import com.zdww.springbootpractise.annotation.di.dao.UserDao;
import com.zdww.springbootpractise.annotation.di.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * UserDao的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-23 11:40
 **/
@Component("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private User user1;

    @Override
    public void useDao() {
        System.out.println("使用userDao的useDao方法打印user信息");
        System.out.println(user1.toString());
    }
}
