package com.yh.springcloud.shop.user.test;

import com.yh.springcloud.alibaba.pojo.User;
import com.yh.springcloud.shop.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class UserServiceTest extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void testInsert() {
        User user = new User();
        user.setUsername("xwjj");
        user.setPassword("1234566");
        user.setPhoneNumber("18611862918");
        int insert = userService.insert(user);
        Assert.assertTrue(insert == 1);
    }

    @Test
    public void testGet(){
        User user = userService.getUserById(1);
        Assert.assertTrue(user != null);
    }
}
