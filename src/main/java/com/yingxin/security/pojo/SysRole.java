package com.yingxin.security.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 17:18
 */
@Data
@TableName("sys_role ")
public class SysRole implements GrantedAuthority {
    private Integer id;
    private String roleName;
    private String roleDesc;
    @Override
    @JsonIgnore
    public String getAuthority() {
        return roleName;
    }
}
