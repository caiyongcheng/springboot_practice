package com.zdww.springbootpractise.annotation.component.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 测试Bean
 *
 * @author : CaiYongcheng
 * @date : 2020-07-15 22:46
 **/
@SuppressWarnings("all")
@Component("person")
public class Person {

    @Autowired
    @Qualifier("cat")
    private Animal animal;

    public void use(){
        animal.use();
    }


}
