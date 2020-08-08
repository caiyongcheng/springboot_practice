package com.zdww.springbootpractise.aop.custom.intercept.impl;

import com.zdww.springbootpractise.aop.custom.intercept.Intercept;
import com.zdww.springbootpractise.aop.custom.invocation.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * springboot-practise
 * Intercept的实现类
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 14:57
 **/
public class InterceptImpl implements Intercept {

    private final Long currentTime = System.currentTimeMillis();

    @Override
    public boolean before() {
        System.out.println("before:执行前方法");
        return true;
    }

    @Override
    public boolean after() {
        System.out.println("after:执行后方法");
        return true;
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around方法执行前");
        Object result = invocation.proceed();
        System.out.println("around方法执行后");
        return result;
    }

    @Override
    public void afterRunning() {
        System.out.println("afterRunning:原方法没有抛出异常");
    }

    @Override
    public void afterThrowing(Exception e) {
        System.out.println("afterThrowing:原方法抛出异常：" + e.getMessage());
    }

    @Override
    public boolean useAround() {
        if (currentTime % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
