package com.itheima.controller;

import com.itheima.entity.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:31
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 根据类型注入
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("Controller层_查询所有用户信息...");
        List<User> users = userService.findAll();
        model.addAttribute("users" , users);
        return "list";
    }


    @RequestMapping("/saveUser")
    public void saveUser(User user , HttpServletRequest request , HttpServletResponse response) throws IOException {
        System.out.println("Controller层_保存用户...");
        int result = userService.saveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }

}
