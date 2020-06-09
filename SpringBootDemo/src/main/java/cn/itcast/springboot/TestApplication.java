package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * spring-boot 的引导类
 */
//@EnableAutoConfiguration  //全局的  自动启用springboot应用的相应配置
//@ComponentScan  //类似于<context:compoent-scan base-package=""> 配置，会扫描他所在的包的以及所有的子包
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
