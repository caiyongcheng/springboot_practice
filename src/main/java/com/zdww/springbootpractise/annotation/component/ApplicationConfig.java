package com.zdww.springbootpractise.annotation.component;

import com.zdww.springbootpractise.annotation.component.pojo.User;
import com.zdww.springbootpractise.annotation.component.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

/**
 * springboot-practise
 * 配置类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-22 14:18
 **/
@Configuration
@ComponentScan(basePackages = "com.zdww.springbootpractise.annotation.component.*"
        , excludeFilters = {@Filter(classes = {Service.class})}
)
public class ApplicationConfig {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user1 = (User) applicationContext.getBean("user1");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
    }
}
