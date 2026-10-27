package com.javasm.day8_filter_inceptor.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.day8_filter_inceptor.user.dao.UserDao;
import com.javasm.day8_filter_inceptor.user.entity.User;
import com.javasm.day8_filter_inceptor.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2026-10-27 19:13:06
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
             @Override
             public PageInfo<User> listByPage(Integer pageNum, Integer pageSize) {
                 PageHelper.startPage(pageNum, pageSize);
                 List<User> userList = this.list();
                 return new PageInfo<>(userList);
             }
}

