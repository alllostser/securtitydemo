package com.yingxin.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/17 16:17
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Secured("ROLE_PRODUCT")
    @RequestMapping("/findAll")
    public String findAll(){
        return "product-list";
    }
}
