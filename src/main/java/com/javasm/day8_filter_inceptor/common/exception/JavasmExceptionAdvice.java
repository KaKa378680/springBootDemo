package com.javasm.day8_filter_inceptor.common.exception;

import com.javasm.day8_filter_inceptor.common.resp.R;
import com.javasm.day8_filter_inceptor.common.resp.ReturnCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : ping
 * @className: JavasmExceptionAdvice
 * @description:
 * @date: 2026/7/22 18:05
 * @version: 0.1
 * @since: jdk17
 */
@RestControllerAdvice
public class JavasmExceptionAdvice {
    @ExceptionHandler(JavasmException.class)
    public R handleJavasmException(JavasmException e){
        e.printStackTrace();
        return R.error(e.getReturnCode());
    }
    @ExceptionHandler(Exception.class)
    public R handleNullPointerException(Exception e){
        e.printStackTrace();
        return R.error(ReturnCode.SYSTEM_ERROR,e.getMessage());
    }
}
