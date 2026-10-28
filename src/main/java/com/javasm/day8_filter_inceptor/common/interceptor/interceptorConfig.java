package com.javasm.day8_filter_inceptor.common.interceptor;

import com.javasm.day8_filter_inceptor.common.filter.MyFilter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : ping
 * @className: interceptorConfig
 * @description:
 * @date: 2026/10/26 17:04
 * @version: 0.1
 * @since: jdk17
 */

/*WebMvcConfigurer 这个是springBoot加载时默认加载的配置*/
/*这个只需要加@Compoment注解,就可以加载到spring容器中*/
@Component
public class interceptorConfig implements WebMvcConfigurer {
    @Resource
    private MyInterceptor myInterceptor;

    @Resource
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor)
                .addPathPatterns("/**")
                .order(1);

        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/login/dologin")
                .order(2);
    }
}
