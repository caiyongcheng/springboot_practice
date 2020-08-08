package com.zdww.springbootpractise.annotation.di;

import com.zdww.springbootpractise.annotation.component.pojo.Animal;
import com.zdww.springbootpractise.annotation.component.pojo.impl.Cat;
import com.zdww.springbootpractise.annotation.component.pojo.impl.Dog;
import com.zdww.springbootpractise.annotation.di.pojo.BusinessMan;
import com.zdww.springbootpractise.annotation.di.pojo.MyDataSource;
import com.zdww.springbootpractise.annotation.di.pojo.User;
import com.zdww.springbootpractise.annotation.di.postprocesor.MyBeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * springboot-practise
 * 配置启动类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-23 11:47
 **/
@Configuration
@ComponentScan(basePackageClasses = {Animal.class, Dog.class, Cat.class,
        BusinessMan.class, MyBeanPostProcessor.class, MyDataSource.class})
@Controller
public class ApplicationConfig {


    @Bean(name = "prototype_user")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User createUser(){
        User user = new User();
        user.setId(100L);
        user.setName("userName111");
        user.setAge(19);
        user.setSex("female");
        return user;
    }

    @Bean(name = "singleton_user")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public User createUser1(){
        User user = new User();
        user.setId(100L);
        user.setName("userName111");
        user.setAge(19);
        user.setSex("female");
        return user;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        User user1 = (User) context.getBean("prototype_user");
        User user2 = (User) context.getBean("prototype_user");
        User user3 = (User) context.getBean("singleton_user");
        User user4 = (User) context.getBean("singleton_user");
        System.out.println(user1 == user2);
        System.out.println(user4 == user3);
    }
}
