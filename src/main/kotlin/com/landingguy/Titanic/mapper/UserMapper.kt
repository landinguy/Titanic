package com.landingguy.Titanic.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.landingguy.Titanic.entity.User
import org.apache.ibatis.annotations.Select

/**
 * @author landing guy
 * @date 2019/12/27
 */
interface UserMapper : BaseMapper<User> {
    @Select("select * from user where username=#{username}")
    fun selectByUsername(username: String?): User
}