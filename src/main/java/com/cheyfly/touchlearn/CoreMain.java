package com.cheyfly.touchlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cheyfly.touchlearn.common.dao")
@SpringBootApplication
public class CoreMain {

    public static void main(String[] args) {
        SpringApplication.run(CoreMain.class, args);
    }
}
