package com.yingxin.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yingxin.security.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 14:34
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from sys_user where username = #{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roles",column = "id",javaType = List.class,
                    many =@Many(select = "com.yingxin.security.mapper.RoleMapper.findByUid")
            )
    })
    User findByName(String username);
}
