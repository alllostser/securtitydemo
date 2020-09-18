package com.yingxin.security.service.impl;

import com.yingxin.security.mapper.UserMapper;
import com.yingxin.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/18 08:47
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userMapper.findByName(s);
    }
}
