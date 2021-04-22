package com.atguigu.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-04-21-12:27
 */
@Component
public class DataSourceProperties {

    //@Value注解  可以将属性配置文件中的属性配置获取并注入
    @Value("${spring.jdbc.datasource.driverClassName}")
        private  String driverClassName;
    @Value("${spring.jdbc.datasource.url}")
        private  String url;
    @Value("${spring.jdbc.datasource.username}")
        private String username;
    @Value("${spring.jdbc.datasource.password}")
        private  String password ;

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
