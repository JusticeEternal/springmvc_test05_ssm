package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("Service层_查询所有用户...");
        return userDao.findAll();
    }

    @Override
    public int saveUser(User user) {
        System.out.println("Service层_保存用户...");
        return userDao.saveUser(user);
    }
}
