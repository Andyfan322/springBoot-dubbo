package com.dubbo.consumer.consumer.controller;

import com.dubbo.consumer.consumer.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andyFan
 * @since 2019年01月13日
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl user;

    @RequestMapping("/user")
    public String user() {
        String str = user.getUser().toString();
        System.out.println("user:" + str);
        return str;
    }
}
