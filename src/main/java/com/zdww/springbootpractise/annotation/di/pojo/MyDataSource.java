package com.zdww.springbootpractise.annotation.di.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * yml文件的读取类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-29 23:39
 **/
@Component
@ConfigurationProperties(prefix = "database")
public class MyDataSource {

    //@Value("${database.driverName")
    private String driverClassName;

    //@Value("${database.url}")
    private String driverUrl;

    //@Value("${database.username}")
    private String userName;

    //@Value("${database.userPwd}")
    private String userPwd;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getDriverUrl() {
        return driverUrl;
    }

    public void setDriverUrl(String driverUrl) {
        this.driverUrl = driverUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"driverClassName\":\"")
                .append(driverClassName).append('\"');
        sb.append(",\"driverUrl\":\"")
                .append(driverUrl).append('\"');
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"userPwd\":\"")
                .append(userPwd).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
