package com.contactphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class ContactPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactPhoneApplication.class, args);
		}

	@Bean
    public OpenAPI openApiConfig() {

        return new OpenAPI().info(apiInfo());

    }

    public Info apiInfo() {

        Info info = new Info();
        info
                .title(" Contact-Phone project Live Code Api")
                .description("RestFull Apies")
                .version("v1.0.0");
        return info;

    }

}
