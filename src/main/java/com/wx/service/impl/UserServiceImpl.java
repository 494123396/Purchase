package com.wx.service.impl;

import com.wx.dao.UserMapper;
import com.wx.pojo.User;
import com.wx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }
}
