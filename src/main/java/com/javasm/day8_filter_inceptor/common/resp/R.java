package com.javasm.day8_filter_inceptor.common.resp;

import lombok.Data;

/**
 * @author : ping
 * @className: R
 * @description:
 * @date: 2026/7/22 16:56
 * @version: 0.1
 * @since: jdk17
 */
@Data
public class R {
    private Integer code;
    private String msg;
    private Object data;

    public static R ok(){
        R r = new R();
        r.setCode(ReturnCode.Success.getCode());
        r.setMsg(ReturnCode.Success.getMsg());
        return r;
    }

    public static R ok(Object o){
        R r = new R();
        r.setCode(ReturnCode.Success.getCode());
        r.setMsg(ReturnCode.Success.getMsg());
        r.setData(o);
        return r;
    }

    public static R error(ReturnCode returnCode){
        R r = new R();
        r.setCode(returnCode.getCode());
        r.setMsg(returnCode.getMsg());
        return r;
    }

    public static R error(ReturnCode returnCode,Object o){
        R r = new R();
        r.setCode(returnCode.getCode());
        r.setMsg(returnCode.getMsg());
        r.setData(o);
        return r;
    }
}
