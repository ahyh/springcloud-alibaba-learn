package com.yh.springcloud.shop.order.feign.consumer.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Integer id;
    private Integer uid;
    private String username;

    private Integer pid;
    private BigDecimal price;
    private Integer pnum;
}
