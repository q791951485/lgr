package com.lgr.lgrorder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket getDocker(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo());
    }

    public ApiInfo getApiInfo(){

        Contact contact = new Contact("lgr", "https://q791951485.github.io/", "791951485@qq.com");

        return new ApiInfo("Order documnet",
                "Order documnet",
                "1.0",
                "https://q791951485.github.io/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
