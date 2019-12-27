package com.landingguy.Titanic.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.landingguy.Titanic.entity.UserRole
import org.apache.ibatis.annotations.Select

/**
 * @author landing guy
 * @date 2019/12/27
 */
interface UserRoleMapper : BaseMapper<UserRole> {

    @Select("select * from user_role where user_id=#{userId}")
    fun selectByUserId(userId: Long?): List<UserRole>
}