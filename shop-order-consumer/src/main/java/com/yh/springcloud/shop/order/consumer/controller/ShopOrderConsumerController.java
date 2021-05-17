package com.yh.springcloud.shop.order.consumer.controller;

import com.yh.springcloud.shop.order.consumer.pojo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ShopOrderConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(ShopOrderConsumerController.class);

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/order/consumer/{id}")
    public Order getOrderById(@PathVariable("id") Integer id){
        return restTemplate.getForObject("http://shop-order/order/"+ id, Order.class);
    }
}
