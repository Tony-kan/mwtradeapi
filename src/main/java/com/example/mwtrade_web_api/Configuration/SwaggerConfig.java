package com.example.mwtrade_web_api.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

@Bean
    public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(mataInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.mwtrade_web_api.Controller"))
            .paths(regex("/v3/MW_Trade/Home.*"))
            .build();
}
private ApiInfo mataInfo(){

    ApiInfo build = new ApiInfoBuilder().title("MWTrade api")
            .description("a website for trading online")
            .version("3.0")
            .termsOfServiceUrl("Terms of Service")
            //.contact(new Contact("Tony kanyamuka","","bsc-com-29-19@unima.ac.mw")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
            .build();

    return build;
}
}
