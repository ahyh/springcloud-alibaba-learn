package com.yh.springcloud.shop.user.mapper;

import com.yh.springcloud.alibaba.pojo.User;

public interface UserMapper {

    int insert(User user);

    User getUserById(Integer id);
}
