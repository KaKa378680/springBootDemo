package com.javasm.day8_filter_inceptor.common.interceptor;

import com.javasm.day8_filter_inceptor.common.exception.JavasmException;
import com.javasm.day8_filter_inceptor.common.resp.ReturnCode;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author : ping
 * @className: LoginInterceptor
 * @description:
 * @date: 2026/10/28 18:50
 * @version: 0.1
 * @since: jdk17
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //检查登陆标记 如果有标记继续访问  如果没有标记  提示未登录
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        //有放过标记，没有走登录流程
        if (user == null) {
            throw new JavasmException(ReturnCode.LOGIN_NOT_LOGIN);
        }

        //根据返回值，决定请求是否继续向下传递
        return true;
    }
}
