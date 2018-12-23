package com.study.dubbo.api.service;

import com.study.dubbo.api.dto.User;

/**
 * Created on 2018-12-17
 *
 * @author liuzhaoyuan
 */
public interface UserService {


    User findUserById(Integer id);

}
