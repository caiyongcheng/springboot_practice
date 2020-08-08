package com.zdww.springbootpractise.aop.custom;

import com.zdww.springbootpractise.aop.custom.intercept.impl.InterceptImpl;
import com.zdww.springbootpractise.aop.custom.proxy.ProxyBean;
import com.zdww.springbootpractise.aop.custom.servise.HelloService;
import com.zdww.springbootpractise.aop.custom.servise.impl.HelloServiceImpl;

/**
 * springboot-practise
 * 程序入口
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 15:51
 **/
public class Application {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxyBean = (HelloService) ProxyBean.getProxyBean(helloService, new InterceptImpl());
        proxyBean.sayHello("");
        proxyBean.sayHello("123");
    }
}
