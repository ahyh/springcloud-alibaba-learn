package com.yh.springcloud.shop.product.service;

import com.yh.springcloud.alibaba.pojo.Product;

public interface ProductService {

    int insert(Product product);

    Product getProductById(Integer id);
}
