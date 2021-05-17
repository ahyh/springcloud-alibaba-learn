package com.yh.springcloud.shop.order.service.impl;

import com.yh.springcloud.alibaba.pojo.Order;
import com.yh.springcloud.shop.order.mapper.OrderMapper;
import com.yh.springcloud.shop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public Order getOrderById(Integer id) {
        return orderMapper.getOrderById(id);
    }
}
