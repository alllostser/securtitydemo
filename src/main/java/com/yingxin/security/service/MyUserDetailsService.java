//package com.yingxin.security.service;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.yingxin.security.pojo.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    LoginService userService;
//    @Autowired
//    HttpServletRequest request;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.getOne(new LambdaQueryWrapper<User>().eq(User::getUsername,username));
//        //logger.info(user.getName());
//        if (user == null){
//            throw new UsernameNotFoundException("用户名不存在!");
//        }
//        HttpSession session = request.getSession();
//        session.setAttribute("user",user);
//        session.setAttribute("sessusername",username);
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//
//        //角色
//        //authorities.add(new SimpleGrantedAuthority(user.getRole()));
//
//        //权限（为了测试，硬编码，实际上应该从数据库中读取）
//        authorities.add(new SimpleGrantedAuthority("1"));
//
//        //logger.info(user.getName()+"角色权限为："+authorities.toString());
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
//    }
//}