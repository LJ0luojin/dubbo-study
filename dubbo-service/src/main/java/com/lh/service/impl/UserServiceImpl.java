package com.lh.impl;

import com.lh.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service  //dubbo的service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo-Web! Three modules";
    }
}
