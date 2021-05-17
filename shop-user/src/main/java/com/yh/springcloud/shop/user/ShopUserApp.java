package com.yh.springcloud.shop.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.yh.springcloud.shop.user.mapper")
@EnableDiscoveryClient
public class ShopUserApp {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserApp.class, args);
    }
}
