package com.yh.springcloud.shop.order.feign.consumer.service;

import com.yh.springcloud.shop.order.feign.consumer.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 通过Feign来调用服务
 *
 * @author yanhuan
 */
@FeignClient("shop-order")
@Component
public interface OrderFeignService {

    @GetMapping(value = "/order/{id}")
    Order getOrderById(@PathVariable("id") Integer id);
}
