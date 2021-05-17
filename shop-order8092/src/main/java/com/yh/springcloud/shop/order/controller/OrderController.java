package com.yh.springcloud.shop.order.controller;

import com.yh.springcloud.alibaba.pojo.Order;
import com.yh.springcloud.shop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "create/order/{uid}/{pid}/{pnum}")
    public Order createOrder(@PathVariable("uid") Integer uid,
                             @PathVariable("pid") Integer pid,
                             @PathVariable("pnum") Integer pnum) {


        return null;
    }

    @GetMapping(value = "order/{id}")
    public Order getOrder(@PathVariable("id") Integer id) {
        System.out.println("OrderController get order:" + 8092);
        return orderService.getOrderById(id);
    }

}
