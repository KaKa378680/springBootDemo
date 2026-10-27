package com.javasm.day8_filter_inceptor.login.controller;

import com.javasm.day8_filter_inceptor.common.resp.R;
import com.javasm.day8_filter_inceptor.login.service.LoginService;
import com.javasm.day8_filter_inceptor.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ping
 * @className: loginController
 * @description:
 * @date: 2026/10/27 20:54
 * @version: 0.1
 * @since: jdk17
 */
@RestController
@RequestMapping("/login")
public class loginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/dologin")
    public R dologin(User inputUser){
        User user = loginService.dologin(inputUser);
        return R.ok(user);
    }
}
