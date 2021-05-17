package com.yh.springcloud.shop.order.remote.service;

import com.yh.springcloud.alibaba.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 通过OpenFeign来调用远程服务
 *
 * @author yanhuan
 */
@Component
@FeignClient(value = "shop-product")
public interface ProductService {

    @GetMapping("/product/{pid}")
    Product getProductById(@PathVariable("pid") Integer pid);
}
