package com.itheima.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:20
 */
public class User implements Serializable {


    //id int(11) NOT NULL
    //username varchar(32) NOT NULL用户名称
    //birthday datetime NULL生日
    //sex char(1) NULL性别
    //address varchar(256) NULL地址

    private Integer id;

    private String username;

    private Date birthday;

    private Character sex;

    private String address;

    public User() {
    }

    public User(Integer id, String username, Date birthday, Character sex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
