package com.jyh.service.impl;

import com.jyh.dao.UserMapper;
import com.jyh.domain.User;
import com.jyh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by OverrideRe on 2017/7/6.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public User findUserById(String userId){
        return userMapper.selectByPrimaryKey(userId);
    }
}
