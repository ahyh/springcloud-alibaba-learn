package com.yh.springcloud.shop.product.controller;

import com.yh.springcloud.alibaba.pojo.Product;
import com.yh.springcloud.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("product/{pid}")
    public Product getProductById(@PathVariable("pid") Integer pid) {
        Product product = productService.getProductById(pid);
        return product;
    }
}
