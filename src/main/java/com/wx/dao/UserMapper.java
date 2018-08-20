package com.wx.dao;

import com.wx.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(User user);
}
