package com.javasm.day8_filter_inceptor.common.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : ping
 * @className: MybatisPlusConfig
 * @description:
 * @date: 2026/8/12 18:25
 * @version: 0.1
 * @since: jdk17
 */
@Configuration
@MapperScan("com.javasm.day8_filter_inceptor.*.dao")
public class MybatisPlusConfig {
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor(){
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
//        return interceptor;
//    }
}
