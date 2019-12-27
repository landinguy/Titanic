package com.landingguy.Titanic

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@EnableScheduling
@SpringBootApplication
@MapperScan("com.landingguy.Titanic.mapper")
class TitanicApplication

fun main(args: Array<String>) {
	runApplication<TitanicApplication>(*args)
}
