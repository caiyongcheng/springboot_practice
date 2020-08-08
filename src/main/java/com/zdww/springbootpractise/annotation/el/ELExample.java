package com.zdww.springbootpractise.annotation.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * springboot-practise
 * el表达式的使用
 *
 * @author : CaiYongcheng
 * @date : 2020-07-31 11:13
 **/
@Component
public class ELExample {
    @Value("#{999}")
    private Integer integer;

    @Value("#{13.49}")
    private Double aDouble;

    @Value("#{45.3f}")
    private Float aFloat;

    @Value("#{123L}")
    private Long along;

    @Value("#{'dadsfadsf'}")
    private String string;

    @Value("#{true}")
    private Boolean aBoolean;

    @Value("#{123}")
    private Byte aByte;

    @Value("#{'a'}")
    private Character character;

    @Value("#{user}")
    private User user;

    @Value("#{user.userName!=null?18:-1}")
    private Integer age;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    public Long getAlong() {
        return along;
    }

    public void setAlong(Long along) {
        this.along = along;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public Byte getaByte() {
        return aByte;
    }

    public void setaByte(Byte aByte) {
        this.aByte = aByte;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"integer\":")
                .append(integer);
        sb.append(",\"aDouble\":")
                .append(aDouble);
        sb.append(",\"aFloat\":")
                .append(aFloat);
        sb.append(",\"along\":")
                .append(along);
        sb.append(",\"string\":\"")
                .append(string).append('\"');
        sb.append(",\"aBoolean\":")
                .append(aBoolean);
        sb.append(",\"aByte\":")
                .append(aByte);
        sb.append(",\"character\":")
                .append(character);
        sb.append(",\"user\":")
                .append(user);
        sb.append(",\"age\":")
                .append(age);
        sb.append('}');
        return sb.toString();
    }
}
