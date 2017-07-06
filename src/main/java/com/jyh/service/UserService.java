package com.jyh.service;

import com.jyh.domain.User;

/**
 * Created by OverrideRe on 2017/7/6.
 */
public interface UserService {

    /**
     * 通过用户id查找用户
     * @param userId 用户id
     * @return 用户对象
     */
    User findUserById(String userId);
}
