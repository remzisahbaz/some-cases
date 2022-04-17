package com.example;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class UseSwaggerOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UseSwaggerOpenApiApplication.class, args);
    }

    @Bean
    public OpenAPI openApiConfig() {

        return new OpenAPI().info(apiInfo());

    }

    public Info apiInfo() {

        Info info = new Info();
        info
                .title(" Example project Live Code Api")
                .description("for example project")
                .version("v1.0.0");
        return info;

    }
}