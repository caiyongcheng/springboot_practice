package com.zdww.springbootpractise.aop.custom.intercept;


import com.zdww.springbootpractise.aop.custom.invocation.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Hercules
 */
public interface Intercept {
    /**
     * 执行前方法
     * @return true: 继续后续操作
     */
    boolean before();

    /**
     * 执行后方法
     * @return 继续后续操作
     */
    boolean after();

    /**
     * 取代目标对象的目标方法
     * @param invocation 回调参数 通过它可以调用目标对象的目标方法
     * @return 自定义逻辑或者目标对象的目标方法的返回值
     */
    Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    /**
     * 事件结束后没有抛出异常时执行此方法
     */
    void afterRunning();

    /**
     * 事件结束后抛出异常时执行
     * @param e 事件所抛出的异常
     */
    void afterThrowing(Exception e);

    /**
     * 决定是否用around方法替代目标对象的原有方法
     * @return true:使用around方法替代目标对象的原有方法
     */
    boolean useAround();
}
