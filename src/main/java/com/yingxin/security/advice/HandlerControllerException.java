package com.yingxin.security.advice;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



/**
 * @program: securtitydemo
 * @description:
 * @author: Guxinyu
 * @created: 2020/09/18 09:40
 */
@ControllerAdvice
public class HandlerControllerException {

    @ExceptionHandler(RuntimeException.class)
    public String handlerException(RuntimeException e){
        if (e instanceof AccessDeniedException){
            return "redirect:/403.jsp";
        }
        return "redirect:/500.jsp";
    }
}
