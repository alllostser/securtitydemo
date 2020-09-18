package com.yingxin.security.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yingxin.security.mapper.UserMapper;
import com.yingxin.security.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 14:28
 */
@Service
public class LoginServiceImpl extends ServiceImpl<UserMapper,User> implements LoginService{

}
