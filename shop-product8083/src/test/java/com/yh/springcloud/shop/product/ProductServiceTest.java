package com.yh.springcloud.shop.product;

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
        product.setName("noddle3");
        product.setPrice(new BigDecimal("9.53"));
        product.setStock(83);
        int insert = productService.insert(product);
        Assert.assertTrue(insert == 1);
    }
}
