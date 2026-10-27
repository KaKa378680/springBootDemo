package com.javasm.day8_filter_inceptor.user.controller;

import com.github.pagehelper.PageInfo;
import com.javasm.day8_filter_inceptor.common.resp.R;
import com.javasm.day8_filter_inceptor.user.entity.User;
import com.javasm.day8_filter_inceptor.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ping
 * @className: userController
 * @description:
 * @date: 2026/8/28 17:57
 * @version: 0.1
 * @since: jdk17
// */
@RestController
@RequestMapping("/user")
public class userController {
     @Autowired
     private UserService userService;

     @RequestMapping("/getUser")
     public R getUser() {
         if(1==1){
             throw new RuntimeException("用户不存在");
         }
         return R.ok();
     }

     @RequestMapping("/list")
    public R getlist(Integer pageNum, Integer pageSize) {
            PageInfo<User> pageInfo = userService.listByPage(pageNum, pageSize);
            return R.ok(pageInfo);
     }

}
