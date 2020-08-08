package com.zdww.springbootpractise.aop.custom.invocation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * springboot-practise
 * 包含目标对象的目标方法与参数，用于在intercept中回调目标对象的目标方法
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 14:42
 **/
public class Invocation {
    /**
     * 方法参数列表
     */
    private Object[] params;

    /**
     * 目标对象中需要执行的方法
     */
    private Method method;

    /**
     * 目标对象
     */
    private Object target;

    public Invocation(Object[] params, Method method, Object target) {
        this.params = params;
        this.method = method;
        this.target = target;
    }

    /**
     * 完成目标对象的目标方法
     * @return 目标对象的目标方法执行后结果
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }
}
