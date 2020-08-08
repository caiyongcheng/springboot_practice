package com.zdww.springbootpractise.annotation.component.pojo.impl;

import com.zdww.springbootpractise.annotation.component.pojo.Animal;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 狗
 *
 * @author : CaiYongcheng
 * @date : 2020-07-15 22:49
 **/
@Component("dog")
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("dog's use");
    }
}
