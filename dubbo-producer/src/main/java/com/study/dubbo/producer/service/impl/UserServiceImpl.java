package com.study.dubbo.producer.service.impl;

import com.study.dubbo.api.dto.User;
import com.study.dubbo.api.service.UserService;

/**
 * Created on 2018-12-17
 *
 * @author liuzhaoyuan
 */
public class UserServiceImpl implements UserService {

    @Override
    public User findUserById(Integer id) {

        User user = new User();
        user.setId(id);
        user.setName("Tom" + id);
        user.setAge(id + 100);

        return user;
    }
}
