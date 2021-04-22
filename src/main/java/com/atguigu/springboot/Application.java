package com.atguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shkstart
 * @create 2021-04-21-10:16
 */
//包扫描，默认扫描主程序所在的包以及子包---约定大于配置
//@ComponentScan("com.atguigu.springboot")
@SpringBootApplication //声明当前项目为SpringBoot项目
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
