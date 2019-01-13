package com.dubbo.consumer.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.rpc.rpc.model.User;
import com.dubbo.rpc.rpc.service.IUser;
import org.springframework.stereotype.Component;

/**
 * @author andyFan
 * @since 2019年01月13日
 */
@Component
public class UserServiceImpl {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private IUser user;


    public User getUser() {
        return user.getUser();
    }
}
