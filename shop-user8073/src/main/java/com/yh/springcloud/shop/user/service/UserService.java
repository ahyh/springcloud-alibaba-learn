package com.yh.springcloud.shop.user.service;

import com.yh.springcloud.alibaba.pojo.User;

public interface UserService {

    int insert(User user);

    User getUserById(Integer id);
}
