package com.dyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.dyz.dao")
public class SnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnsApplication.class, args);
    }

}
