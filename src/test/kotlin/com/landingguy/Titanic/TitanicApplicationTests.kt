package com.landingguy.Titanic

import com.landingguy.Titanic.entity.User
import com.landingguy.Titanic.service.UserService
import org.junit.Test
import org.junit.runner.RunWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

@RunWith(SpringRunner::class)
@SpringBootTest
class TitanicApplicationTests {
    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Resource
    lateinit var userService: UserService

    @Test
    fun contextLoads() {
        log.info("###{}",BCryptPasswordEncoder().encode("123456"))
//        userService.insert(User(null, "peter", BCryptPasswordEncoder().encode("123456")))
//        userService.selectByUsername("jack")?.let { log.info("user#$it") }
    }


    //CREATE TABLE `user_role` (
    //  `user_id` int(11) NOT NULL,
    //  `role_id` int(11) NOT NULL,
    //  PRIMARY KEY (`user_id`,`role_id`)
    //) ENGINE=InnoDB DEFAULT CHARSET=utf8
}
