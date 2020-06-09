package cn.itcast.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //@controller + @Responsbody //整个controller的方法都接受josn格式的数据，方法上就不用写responsbody了
@RequestMapping("hello") //全局
public class HelloController2 {

    @GetMapping("show2")
    public String test() {
        return "hello word2  spring boot";
    }

}
