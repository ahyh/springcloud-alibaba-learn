package com.yh.springcloud.shop.order.mapper;

import com.yh.springcloud.alibaba.pojo.Order;

public interface OrderMapper {

    int insert(Order order);

    Order getOrderById(Integer id);
}
