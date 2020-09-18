package com.yingxin.security.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.yingxin.security.mapper.RoleMapper;
import com.yingxin.security.pojo.SysRole;
import com.yingxin.security.pojo.User;
import com.yingxin.security.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 14:26
 */
@RestController
public class login {
    @Autowired
    private RoleMapper roleMapper;
    @GetMapping("/list")
    public List<SysRole> list(){
        List<SysRole> byUid = roleMapper.findByUid(1);
        return byUid;
    }
}
