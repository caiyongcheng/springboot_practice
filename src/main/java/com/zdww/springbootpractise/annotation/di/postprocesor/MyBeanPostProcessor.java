package com.zdww.springbootpractise.annotation.di.postprocesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 后置Bean处理器的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-26 00:58
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getSimpleName() + "类的实例"
                + "调用了postProcessBeforeInitialization方法， beanName是:"
                + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean.getClass().getSimpleName() + "类的实例"
                + "调用了postProcessAfterInitialization方法， beanName是:"
                + beanName);
        return bean;
    }
}
