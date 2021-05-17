package com.yh.springcloud.shop.product.mapper;

import com.yh.springcloud.alibaba.pojo.Product;

public interface ProductMapper {

    int insert(Product product);

    Product getProductById(Integer id);
}
