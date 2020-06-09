package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

//@Controller
@RestController  //@controller + @Responsbody //整个controller的方法都接受josn格式的数据，方法上就不用写responsbody了
@RequestMapping("hello") //全局
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String test(){
        return "hello word  spring boot";
    }

}
