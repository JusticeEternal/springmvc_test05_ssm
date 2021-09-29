package com.itheima.service;

import com.itheima.entity.User;

import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:31
 */
public interface UserService {

    List<User> findAll();

    int saveUser(User user);

}
