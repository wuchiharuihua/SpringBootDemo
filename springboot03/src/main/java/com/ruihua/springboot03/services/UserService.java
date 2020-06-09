package com.ruihua.springboot03.services;

import com.ruihua.springboot03.entity.User;
import com.ruihua.springboot03.exception.UserException;
import com.ruihua.springboot03.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Integer register(User user) throws UserException{
        String password = queryUser(user.getUsername());
        if (password != null){
            throw new UserException("该用户名已存在！");
        }
        return userMapper.insertNewUser(user);
    }

    public String findUser(String username) throws UserException{
        String password = queryUser(username);
        if(password == null){
            throw new UserException("用户名或密码错误！");
        }
        return password;
    }

    private String queryUser(String username){
        return userMapper.findUser(username);
    }
}
