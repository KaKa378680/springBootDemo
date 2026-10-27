package com.javasm.day8_filter_inceptor.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.javasm.day8_filter_inceptor.user.entity.User;
import com.github.pagehelper.PageInfo;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2026-10-27 19:13:06
 */
public interface UserService extends IService<User> {
            public PageInfo<User> listByPage(Integer pageNum, Integer pageSize);
}

