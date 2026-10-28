package com.javasm.day8_filter_inceptor.common.resp;

import lombok.Getter;

/**
 * @author : ping
 * @className: ReturnCode
 * @description:
 * @date: 2026/7/22 16:58
 * @version: 0.1
 * @since: jdk17
 */
@Getter
public enum ReturnCode {
    Success(10000,"调用成功"),
    REG_NAME_DUP(10001,"用户名已存在"),
    LOGIN_SUCCESS(20001,"登录成功"),
    LOGIN_FAILED(20002,"登录失败"),
    LOGIN_NOT_LOGIN(20003,"未登录"),
    ADD_PROD_FAILED(30001,"商品已存在"),
    SYSTEM_ERROR(500,"系统异常");
    private Integer code;
    private String msg;
    ReturnCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
