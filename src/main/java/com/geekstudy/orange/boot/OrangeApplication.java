package com.geekstudy.orange.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.geekstudy.orange"})
@MapperScan("com.geekstudy.orange.db")
@SpringBootApplication(scanBasePackages = "com.geekstudy.orange")
public class OrangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangeApplication.class, args);
    }

}
