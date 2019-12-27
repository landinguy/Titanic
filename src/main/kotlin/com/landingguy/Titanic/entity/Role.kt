package com.landingguy.Titanic.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import javax.persistence.*

/**
 * @author landing guy
 * @date 2019/12/27
 */
@Table
@Entity
data class Role(
        @Id
        @TableId(type = IdType.AUTO)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @Column(columnDefinition = "varchar(40)")
        var name: String
)