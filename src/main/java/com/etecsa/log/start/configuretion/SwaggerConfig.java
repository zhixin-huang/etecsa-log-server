package com.etecsa.log.start.configuretion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("com.etecsa.log.start.controller"))
	            .paths(PathSelectors.any()).build();
	}


	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	        .title("通用日志系统组件（etecsa-log-server）Swagger 接口文档")
	        .description("etecsa-log-server")
	        .termsOfServiceUrl("http://192.168.1.2:8769/druid")
	        .version("1.0.0").build();
	    }

}
