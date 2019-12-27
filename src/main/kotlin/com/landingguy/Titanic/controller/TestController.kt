package com.landingguy.Titanic.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author landing guy
 * @date 2019/12/27
 */
@RestController
class TestController {

    @GetMapping("hello")
    fun hello(): String = "hello, titanic"
}