package com.landingguy.Titanic.service

import com.landingguy.Titanic.entity.User
import com.landingguy.Titanic.mapper.UserMapper
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Service
class UserService {
    @Resource
    lateinit var userMapper: UserMapper

    fun insert(user: User) = userMapper.insert(user)

    fun selectById(id: Long): User = userMapper.selectById(id)

    fun selectByUsername(username: String?): User? = userMapper.selectByUsername(username)
}