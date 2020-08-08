package com.zdww.springbootpractise.annotation.di.pojo;

import com.zdww.springbootpractise.annotation.component.pojo.Animal;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * springboot-practise
 * 商人类
 * @author : CaiYongcheng
 * @date : 2020-07-25 18:03
 **/
@Component
public class BusinessMan extends User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private Animal animal;

    public BusinessMan(@Autowired @Qualifier("cat") Animal animal,
                       @Value("1") Long id,
                       @Value("name1") String name,
                       @Value("23") Integer age,
                       @Value("male") String sex) {
        super();
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.animal = animal;
        System.out.println("使用构造器注入");
    }

    public void use(){
        System.out.println("调用了use方法");
        this.animal.use();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法执行");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("调用自定义销毁方法");
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        System.out.println("延迟注入");
        this.animal = animal;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "实现了BeanFactoryAware，"
                + "正在调用setBeanFactory方法,参数:" + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(this.getClass().getSimpleName() + "实现了BeanNameAware，"
                + "正在调用setBeanName方法,参数:" + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "实现了ApplicationContextAware，"
                + "正在调用setApplicationContext方法, 参数:" + applicationContext.toString());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "实现了DisposableBean，"
                + "正在调用destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "实现了InitializingBean，"
                + "正在调用afterPropertiesSet方法");
    }
}
