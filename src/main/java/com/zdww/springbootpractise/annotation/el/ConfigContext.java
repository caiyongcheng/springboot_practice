package com.zdww.springbootpractise.annotation.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * springboot-practise
 * 配置文件
 *
 * @author : CaiYongcheng
 * @date : 2020-07-31 14:13
 **/
@Configuration
@ComponentScan(basePackages = {"com.zdww.springbootpractise.annotation.el"})
public class ConfigContext {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigContext.class);
        ELExample bean = ctx.getBean(ELExample.class);
        System.out.println(bean.toString());
    }


}
