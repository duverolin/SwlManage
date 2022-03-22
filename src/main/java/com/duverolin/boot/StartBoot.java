package com.duverolin.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
// 开启事务管理
@SuppressWarnings("ALL")
@EnableTransactionManagement
//程序入口
@SpringBootApplication
//扫描过滤器
@ServletComponentScan(basePackages = "com.duverolin.filter")
// 被纳入扫描的层
@ComponentScan(basePackages = {"com.duverolin.controller", "com.duverolin.entity", "com.duverolin.services"})
//扫描Mapper
@MapperScan(basePackages = "com.duverolin.mapper")
class StartBoot {
    /**
     * 用于启动SpringBoot
     */
    public static void main(String[] args) {
        SpringApplication.run(StartBoot.class, args);
    }
}
