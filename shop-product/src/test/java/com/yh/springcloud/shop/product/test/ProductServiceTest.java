package com.yh.springcloud.shop.product.test;

import com.yh.springcloud.alibaba.pojo.Product;
import com.yh.springcloud.shop.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ProductServiceTest extends BaseTest {

    @Autowired
    ProductService productService;

    @Test
    public void testInsert() {
        Product product = new Product();
        product.setName("noddle");
        product.setPrice(new BigDecimal("9.5"));
        product.setStock(88);
        int insert = productService.insert(product);
        Assert.assertTrue(insert == 1);
    }
}
