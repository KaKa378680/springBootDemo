package com.javasm.day8_filter_inceptor;

import com.javasm.day8_filter_inceptor.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day8FilterInceptorApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        userService.listByPage(1,10);
    }

}
