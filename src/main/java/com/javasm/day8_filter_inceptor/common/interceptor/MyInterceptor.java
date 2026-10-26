package com.javasm.day8_filter_inceptor.common.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : ping
 * @className: MyInterceptor
 * @description:
 * @date: 2026/10/26 17:08
 * @version: 0.1
 * @since: jdk17
 */
@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //preHandle 前置处理
        System.out.println("前置执行了...");
        //根据返回值，决定请求是否继续向下传递
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //postHandle 后置处理
        //方法执行完毕调用
        System.out.println("后置执行了...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //aftrCompletion 相当于finally  无论是否异常 都会调用
        System.out.println("错不错都执行...");
    }
}
