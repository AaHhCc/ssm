package com.jyh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jyh.dao.UserMapper;
import com.jyh.domain.User;
import com.jyh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by OverrideRe on 2017/7/6.
 *用户的service层
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
