package com.yh.springcloud.shop.order.feign.consumer.controller;

import com.yh.springcloud.shop.order.feign.consumer.pojo.Order;
import com.yh.springcloud.shop.order.feign.consumer.service.OrderFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderFeignConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(OrderFeignConsumerController.class);

    @Autowired
    private OrderFeignService orderFeignService;

    @GetMapping(value = "/order/consumer/{id}")
    public Order getOrderById(@PathVariable("id") Integer id){
        return orderFeignService.getOrderById(id);
    }
}
