package com.javasm.day8_filter_inceptor.common.aspact;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author : ping
 * @className: MyAspact
 * @description:
 * @date: 2026/11/19 19:55
 * @version: 0.1
 * @since: jdk17
 */
@Component
@Aspect
public class MyAspact {
    //可以自定义方法 定义要执行的公共方法
    //前置通知
    //粗颗粒度(切到类) 细颗粒度(切到方法)
    //@Before("within(com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl)")
    @Before("execution(com.github.pagehelper.PageInfo com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl.listBy*(..))")
    public void MyBefore() {
        System.out.println("MyBefore执行了...");
    }
}
