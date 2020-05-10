package com.lgr.lgrcontroller;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class LgrControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LgrControllerApplication.class, args);
    }

}
