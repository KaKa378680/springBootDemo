package com.javasm.day8_filter_inceptor.common.exception;

import com.javasm.day8_filter_inceptor.common.resp.ReturnCode;
import lombok.Getter;

/**
 * @author : ping
 * @className: javasmException
 * @description:
 * @date: 2026/7/22 19:49
 * @version: 0.1
 * @since: jdk17
 */
@Getter
public class JavasmException extends RuntimeException {
    private ReturnCode returnCode;
    public JavasmException(ReturnCode returnCode) {
        super(returnCode.getMsg());
        this.returnCode = returnCode;
    }
}
