package com.itheima.dao;

import com.itheima.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:31
 */
@Repository
public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(username , birthday , sex , address) values(#{username} , #{birthday} , #{sex} , #{address})")
    int saveUser(User user);

}
