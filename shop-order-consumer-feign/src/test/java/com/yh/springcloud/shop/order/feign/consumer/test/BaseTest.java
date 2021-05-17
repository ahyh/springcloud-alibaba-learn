package com.yh.springcloud.shop.order.feign.consumer.test;

import com.yh.springcloud.shop.order.feign.consumer.pojo.Order;
import com.yh.springcloud.shop.order.feign.consumer.service.OrderFeignService;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {

    @Autowired
    private OrderFeignService orderFeignService;

    @Test
    public void testGet(){
        Order order = orderFeignService.getOrderById(2);
        Assert.assertTrue(order != null);
    }
}
