package com.ruihua.springboot03.controllers;

import com.ruihua.springboot03.entity.User;
import com.ruihua.springboot03.mappers.UserMapper;
import com.ruihua.springboot03.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String login(String username, String password) {
        if(password == null || username == null){
            return "请输入用户名或密码！";
        }
        String queryPassword = userService.findUser(username);
        if (password.equals(queryPassword)){
            return  "登录成功！";
        }
        return "用户名或密码错误！";
    }

    @RequestMapping("register")
    public String register(String username, String password) {
        if(password == null || username == null){
            return "请输入用户名或密码！";
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalt(password);
        int i = userService.register(user);
        System.out.println("有"+ i + "个人注册了");
        return  "注册成功";
    }
}
