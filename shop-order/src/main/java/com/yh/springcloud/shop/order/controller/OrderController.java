package com.yh.springcloud.shop.order.controller;

import com.yh.springcloud.alibaba.pojo.Order;
import com.yh.springcloud.alibaba.pojo.Product;
import com.yh.springcloud.shop.order.remote.service.ProductService;
import com.yh.springcloud.shop.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping(value = "create/order/{uid}/{pid}/{pnum}")
    public Order createOrder(@PathVariable("uid") Integer uid,
                             @PathVariable("pid") Integer pid,
                             @PathVariable("pnum") Integer pnum) {

        Product product = productService.getProductById(pid);
        Order order = new Order();
        order.setPid(product.getId());
        order.setPrice(product.getPrice());
        order.setPnum(1);
        return order;
    }

    @GetMapping(value = "order/{id}")
    public Order getOrder(@PathVariable("id") Integer id) {
        System.out.println("OrderController get order:" + 8091);
        return orderService.getOrderById(id);
    }

}
