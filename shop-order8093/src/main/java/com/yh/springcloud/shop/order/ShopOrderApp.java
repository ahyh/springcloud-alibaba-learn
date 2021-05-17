package com.yh.springcloud.shop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.yh.springcloud.shop.order.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class ShopOrderApp {

    public static void main(String[] args) {
        SpringApplication.run(ShopOrderApp.class, args);
    }
}
