package com.javasm.day8_filter_inceptor.common.filter;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ping
 * @className: MyFilterConfig
 * @description:
 * @date: 2026/8/26 18:29
 * @version: 0.1
 * @since: jdk17
 */
@Configuration
public class MyFilterConfig  {

    @Bean
    public FilterRegistrationBean myFilterRegistration() {
           FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
           filterRegistrationBean.setFilter(new MyFilter());
           filterRegistrationBean.addUrlPatterns("/*");
           return filterRegistrationBean;
    }

}