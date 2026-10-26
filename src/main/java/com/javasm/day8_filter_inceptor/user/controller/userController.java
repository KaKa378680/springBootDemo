package com.javasm.day8_filter_inceptor.user.controller;

import com.javasm.day8_filter_inceptor.common.resp.R;
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
     @RequestMapping("/getUser")
     public R getUser() {
         if(1==1){
             throw new RuntimeException("用户不存在");
         }
         return R.ok();
     }

}
