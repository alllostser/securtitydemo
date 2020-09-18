package com.yingxin.security.demo.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/18 09:10
 */
public class Encoded {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("123");
        System.out.println(encode);
    }
}
