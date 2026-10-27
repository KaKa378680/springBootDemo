package com.javasm.day8_filter_inceptor.login.service;

import com.javasm.day8_filter_inceptor.common.resp.R;
import com.javasm.day8_filter_inceptor.user.entity.User;

/**
 * @author : ping
 * @className: LoginService
 * @description:
 * @date: 2026/10/27 20:43
 * @version: 0.1
 * @since: jdk17
 */
public interface LoginService {
    User dologin(User inputUser);
}
