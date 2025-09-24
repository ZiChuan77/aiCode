package com.fatchuan.chuanaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fatchuan.chuanaicodemother.mapper")
public class ChuanAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuanAiCodeMotherApplication.class, args);
    }

}
