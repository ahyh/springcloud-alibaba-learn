package com.yh.springcloud.shop.order.test;

import com.yh.springcloud.alibaba.pojo.Order;
import com.yh.springcloud.shop.order.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class OrderServiceTest extends BaseTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testInsert() {
        Order order = new Order();
        order.setUid(3);
        order.setUsername("xwj3");
        order.setPid(1);
        order.setPrice(new BigDecimal("9.6"));
        order.setPnum(2);
        int insert = orderService.insert(order);
        Assert.assertTrue(insert == 1);
    }
}
