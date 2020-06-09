package com.ruihua.springboot03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ruihua.springboot03.mappers")
@SpringBootApplication
public class Springboot03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

}
