package com.zdww.springbootpractise.annotation.component.pojo.impl;

import com.zdww.springbootpractise.annotation.component.pojo.Animal;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 猫
 *
 * @author : CaiYongcheng
 * @date : 2020-07-26 00:15
 **/
@Component("cat")
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("cat's use");
    }
}
