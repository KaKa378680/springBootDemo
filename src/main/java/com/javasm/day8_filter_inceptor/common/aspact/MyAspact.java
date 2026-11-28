package com.javasm.day8_filter_inceptor.common.aspact;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
    //单独定义切点
    @Pointcut("within(com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl)")
    public void myPointcut1() {}

    @Pointcut("execution(com.github.pagehelper.PageInfo com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl.listBy*(..))")
    public void myPointcut2() {}

    //可以自定义方法 定义要执行的公共方法
    //前置通知
    //粗颗粒度(切到类) within(com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl)
    //细颗粒度(切到方法) execution(com.github.pagehelper.PageInfo com.javasm.day8_filter_inceptor.user.service.impl.UserServiceImpl.listBy*(..))
    //通过模糊匹配 可以切同一类结构的方法
    @Before("myPointcut2()")
    public void myBefore(JoinPoint joinPoint) {
        //joinPoint 目标方法
        //获得方法签名 getSignature()
        System.out.println(joinPoint.getSignature().getName());
        for (Object arg : joinPoint.getArgs()) {
            System.out.println(arg);
        }
        System.out.println("MyBefore执行了...");
    }

    @AfterReturning(pointcut = "myPointcut2()",returning = "resObj")
    public void myAfterReturning(Object resObj,JoinPoint joinPoint) {
        //joinPoint 目标方法
        //需要配置返回值类型相同的方法，方便统一处理
        //如果代码中出现异常 后置通知不执行
        System.out.println(resObj);
        System.out.println("myAfterReturning执行了....");
    }

    //异常通知，专门处理异常情况
    @AfterThrowing(pointcut = "myPointcut2()",throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
        //joinPoint 目标方法
        System.out.println(e.getMessage());
        System.out.println("myAfterReturning执行了....");
    }

}
