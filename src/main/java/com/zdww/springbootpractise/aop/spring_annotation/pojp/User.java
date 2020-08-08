package com.zdww.springbootpractise.aop.spring_annotation.pojp;

/**
 * springboot-practise
 * pojo
 *
 * @author : CaiYongcheng
 * @date : 2020-08-02 20:12
 **/
public class User {

    private Long id;

    private String userName;

    private String userNote;

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

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"userName\":\"")
                .append(userName).append('\"');
        sb.append(",\"userNote\":\"")
                .append(userNote).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
