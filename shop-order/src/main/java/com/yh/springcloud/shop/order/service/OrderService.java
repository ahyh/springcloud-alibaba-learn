package com.yh.springcloud.shop.order.service;

import com.yh.springcloud.alibaba.pojo.Order;

public interface OrderService {

    int insert(Order order);

    Order getOrderById(Integer id);



}
