package com.lgr.lgruser;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableDubbo
@SpringBootApplication
public class LgrUserApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LgrUserApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LgrUserApplication.class);
    }

}
