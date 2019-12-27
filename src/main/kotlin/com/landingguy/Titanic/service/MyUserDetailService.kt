package com.landingguy.Titanic.controller

import com.landingguy.Titanic.service.RoleService
import com.landingguy.Titanic.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Service
class MyUserDetailService : UserDetailsService {
    val log: Logger = LoggerFactory.getLogger(this.javaClass)
    @Resource
    lateinit var userService: UserService
    @Resource
    lateinit var roleService: RoleService

    override fun loadUserByUsername(username: String?): UserDetails {
        log.info("username#$username")
        val user = com.landingguy.Titanic.entity.User(0L, "", "")
        val list = mutableListOf<GrantedAuthority>()
        userService.selectByUsername(username)?.let {
            user.username = it.username
            user.password = it.password
            roleService.selectByUserId(it.id).forEach {
                roleService.selectById(it.roleId)?.let {
                    list.add(SimpleGrantedAuthority(it.name))
                }
            }
        }
        return User(user.username, user.password, list)
    }
}