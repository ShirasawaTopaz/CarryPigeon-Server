package com.carrypigeon.server;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.carrypigeon.server.**.mapper")
public class CarryPigeonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarryPigeonApplication.class, args);
    }
}
