package com.ruihua.springboot02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private BlogProperties bp;

    @RequestMapping("/")
    public String index(){
        System.out.println("客户端访问了这个服务");
        return bp.getWholetitle();
    }

    @Autowired
    private TestConfigBean test;

    @RequestMapping("/test")
    public String index2(){
        return test.getName() +""+ test.getAge();
    }

    @RequestMapping("/nishishi")
    public String index3(){
        return "you are a big";
    }

}
