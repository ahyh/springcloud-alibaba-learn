package com.yh.springcloud.shop.user.service.impl;

import com.yh.springcloud.alibaba.pojo.User;
import com.yh.springcloud.shop.user.mapper.UserMapper;
import com.yh.springcloud.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
