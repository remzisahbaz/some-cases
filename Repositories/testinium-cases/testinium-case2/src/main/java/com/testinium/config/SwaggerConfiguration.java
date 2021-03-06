/**
 * 
 */
package com.testinium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfiguration implements WebMvcConfigurer{

	   @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.select()
	                .apis(RequestHandlerSelectors.any())
	                .paths(PathSelectors.regex("/.*"))
	                .build();
	   }
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		
		registry.addResourceHandler("/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		
		}
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {

				registry.addRedirectViewController("/v2/api-docs", "/v2/api-docs");
				registry.addRedirectViewController("/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");
			    registry.addRedirectViewController("/swagger-resources/configuration/security", "/swagger-resources/configuration/security");
			    registry.addRedirectViewController("/swagger-resources", "/swagger-resources");
		}


		
}
