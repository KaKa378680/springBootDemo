package com.javasm.day8_filter_inceptor.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.javasm.day8_filter_inceptor.common.exception.JavasmException;
import com.javasm.day8_filter_inceptor.login.service.LoginService;
import com.javasm.day8_filter_inceptor.user.entity.User;
import com.javasm.day8_filter_inceptor.user.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javasm.day8_filter_inceptor.common.resp.ReturnCode;

/**
 * @author : ping
 * @className: LoginServiceImpl
 * @description:
 * @date: 2026/10/27 20:44
 * @version: 0.1
 * @since: jdk17
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

    @Override
    public User dologin(User inputUser) {
        if (inputUser == null || "".equals(inputUser.getUsername()) || "".equals(inputUser.getPassword())) {
            throw new JavasmException(ReturnCode.LOGIN_FAILED);
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUsername, inputUser.getUsername()).eq(User::getPassword, inputUser.getPassword());
        User user = userService.getOne(queryWrapper);
        if (user == null) {
            throw new JavasmException(ReturnCode.LOGIN_FAILED);
        }
        //获取会话对象，服务器中的共享空间
        HttpSession session = request.getSession();
        //session中存入登陆标记
        session.setAttribute("user", user);

        return user;
    }
}
