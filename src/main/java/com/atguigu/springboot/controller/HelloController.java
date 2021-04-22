package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.DataSourceProperties;
import com.atguigu.springboot.bean.DataSourcePropeties2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2021-04-21-10:19
 */

@RestController //组合注解，组合了@Controller+@ResponseBody
public class HelloController {

    @Autowired//spring框架提供，先bytype，再byname
    DataSourceProperties dataSourceProperties;

    @Autowired
    DataSourcePropeties2 dataSourcePropeties2;

    @RequestMapping("/hello")
    public String hello(){

        System.out.println("dsp"+dataSourceProperties);
        return "hello ,springboot...";
    }

}
