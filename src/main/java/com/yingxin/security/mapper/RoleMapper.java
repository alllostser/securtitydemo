package com.yingxin.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yingxin.security.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 17:22
 */
@Mapper
public interface RoleMapper extends BaseMapper<SysRole> {

    @Select("select r.id,r.role_name roleName,r.role_desc roleDesc from sys_role r,sys_user_role ur where r.id=ur.uid and ur.uid = #{uid}")
    List<SysRole> findByUid(Integer uid);
}
