package com.javasm.day8_filter_inceptor.common.filter;

import jakarta.servlet.*;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author : ping
 * @className: MyFilter
 * @description:
 * @date: 2026/8/26 18:29
 * @version: 0.1
 * @since: jdk17
 */
@Configuration
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig){
        System.out.println("MyFilter 创建了。。。");
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter 销毁了。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.addHeader("MyFilter", "MyFilterMyFilter3123123");
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
