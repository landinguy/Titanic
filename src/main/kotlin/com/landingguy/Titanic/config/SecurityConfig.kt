package com.landingguy.Titanic.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import javax.annotation.Resource

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Resource
    lateinit var userDetailsService: UserDetailsService

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.formLogin()
                .defaultSuccessUrl("/hello").permitAll()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated()
    }

    override fun configure(web: WebSecurity?) {
        // 设置拦截忽略文件夹，可以对静态资源放行
        web?.ignoring()?.antMatchers("/css/**", "/js/**")
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.userDetailsService(userDetailsService)?.passwordEncoder(NoOpPasswordEncoder.getInstance())
    }
}