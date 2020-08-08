package com.zdww.springbootpractise.aop.spring_annotation.aspect;

import com.zdww.springbootpractise.aop.custom.invocation.Invocation;
import org.aspectj.lang.annotation.*;

import java.lang.reflect.InvocationTargetException;

/**
 * springboot-practise
 * 切面
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 20:20
 **/
@Aspect
public class UserServiceAspect {

    @Pointcut("execution(* com.zdww.springbootpractise.aop.spring_annotation.service.impl.HelloServiceImpl.sayHello(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before:执行前方法");
    }

    @After("pointCut()")
    public boolean after() {
        System.out.println("after:执行后方法");
        return true;
    }

    @AfterReturning("pointCut()")
    public void afterRunning() {
        System.out.println("afterRunning:原方法没有抛出异常");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing:原方法抛出异常：" );
    }
}
