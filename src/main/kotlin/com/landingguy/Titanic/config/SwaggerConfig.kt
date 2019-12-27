package com.landingguy.Titanic.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Configuration
class SwaggerConfig {

    @Bean
    fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.landingguy.Titanic.controller"))
            .paths(PathSelectors.any()).build()

    private fun apiInfo(): ApiInfo = ApiInfoBuilder().title("Titanic-API文档").description("Titanic-API文档").version("1.0").build()
}