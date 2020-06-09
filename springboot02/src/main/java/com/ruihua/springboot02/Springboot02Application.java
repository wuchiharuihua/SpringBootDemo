package com.ruihua.springboot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({BlogProperties.class})
@SpringBootApplication
public class Springboot02Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02Application.class, args);

	}
}
