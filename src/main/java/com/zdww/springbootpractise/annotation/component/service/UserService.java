package com.zdww.springbootpractise.annotation.component.service;

import com.zdww.springbootpractise.annotation.component.pojo.User;

/**
 * @author Hercules
 */
public interface UserService {
    /**
     * 打印User信息
     * @param user 用户
     */
    void printUser(User user);
}
