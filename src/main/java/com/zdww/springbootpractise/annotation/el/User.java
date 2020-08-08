package com.zdww.springbootpractise.annotation.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 用户
 *
 * @author : CaiYongcheng
 * @date : 2020-07-31 14:09
 **/
@Component("user")
public class User {
    @Value("#{'caiyongcheng'}")
    private String userName;

    @Value("#{'caiyongcheng s password'}")
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"userPassword\":\"")
                .append(userPassword).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
