package com.javasm.day8_filter_inceptor.common.interceptor.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : ping
 * @className: NoAuth
 * @description:
 * @date: 2026/10/29 19:19
 * @version: 0.1
 * @since: jdk17
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoAuth {

}
