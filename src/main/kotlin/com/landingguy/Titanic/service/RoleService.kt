package com.landingguy.Titanic.service

import com.landingguy.Titanic.entity.Role
import com.landingguy.Titanic.entity.User
import com.landingguy.Titanic.entity.UserRole
import com.landingguy.Titanic.mapper.RoleMapper
import com.landingguy.Titanic.mapper.UserMapper
import com.landingguy.Titanic.mapper.UserRoleMapper
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Service
class RoleService {
    @Resource
    lateinit var roleMapper: RoleMapper
    @Resource
    lateinit var userRoleMapper: UserRoleMapper

    fun insert(role: Role) = roleMapper.insert(role)

    fun selectById(id: Long): Role = roleMapper.selectById(id)

    fun selectByUserId(id:Long?):List<UserRole> = userRoleMapper.selectByUserId(id)
}