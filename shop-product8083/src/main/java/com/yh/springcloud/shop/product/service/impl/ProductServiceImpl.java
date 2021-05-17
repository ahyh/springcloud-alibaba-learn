package com.yh.springcloud.shop.product.service.impl;

import com.yh.springcloud.alibaba.pojo.Product;
import com.yh.springcloud.shop.product.mapper.ProductMapper;
import com.yh.springcloud.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public int insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.getProductById(id);
    }
}
