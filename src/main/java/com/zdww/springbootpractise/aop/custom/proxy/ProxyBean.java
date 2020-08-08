package com.zdww.springbootpractise.aop.custom.proxy;

import com.zdww.springbootpractise.aop.custom.intercept.Intercept;
import com.zdww.springbootpractise.aop.custom.invocation.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * springboot-practise
 * 生成对应对象的代理对象
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 15:32
 **/
public class ProxyBean implements InvocationHandler {
    /**
     * 需要代理的目标对象
     */
    private Object target;

    /**
     * 切面
     */
    private Intercept intercept;

    /**
     * 获取被代理对象的代理对象
     * @param target 需要代理的目标对象
     * @param intercept 切面的具体实现类
     * @return 代理对象
     */
    public static Object getProxyBean(Object target, Intercept intercept) {
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.intercept = intercept;
        Class<?> targetClass = target.getClass();
        return Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(),
                proxyBean);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        Invocation invocation = new Invocation(args, method, target);
        try {
            intercept.before();
            if (intercept.useAround()) {
                result = intercept.around(invocation);
            } else {
                result = invocation.proceed();
            }
            intercept.after();
            intercept.afterRunning();
        } catch(Exception e) {
            intercept.afterThrowing(e);
        }
        return result;
    }
}
