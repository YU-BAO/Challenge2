package com.yubao.serverTwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yubao.serverTwo.mapper")
@SpringBootApplication
public class ServerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerTwoApplication.class, args);
    }

}
