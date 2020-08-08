package com.zdww.springbootpractise.annotation.component.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * 用户实体类
 *
 * @author : CaiYongcheng
 * @date : 2020-07-22 14:14
 **/
@Component("user1")
public class User {
    @Value("2")
    private Long id;
    @Value("userName2")
    private String userName;
    @Value("userNote2")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"note\":\"")
                .append(note).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
