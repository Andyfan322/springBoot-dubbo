package com.dubbo.provide.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.rpc.rpc.model.User;
import com.dubbo.rpc.rpc.service.IUser;
import org.springframework.stereotype.Component;

/**
 * @author andyFan
 * @since 2019年01月13日
 */
@Service(interfaceClass = IUser.class)
@Component
public class UserServiceImpl implements IUser {
    @Override
    public User getUser() {
        User user = new User();
        user.setName("huang");
        user.setAge(11);
        return user;
    }
}
