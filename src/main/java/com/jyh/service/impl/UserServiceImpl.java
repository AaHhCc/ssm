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

    public PageInfo selectAllUser(Map<String, String> params) {
        String userNickName = "";
        Integer pageSize = 10;
        Integer pageNum = 1;
        Date startDate = null;
        Date endDate = null;
        List<User> list = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            for (String s : params.keySet()) {
                if(s.equals("userNickName"))
                    userNickName = params.get(s);
                else if(s.equals("pageSize"))
                    pageSize = Integer.parseInt(params.get("pageSize"));
                else if(s.equals("pageNum"))
                    pageNum = Integer.parseInt(params.get("pageNum"));
                else if(s.equals("startDate") && !"".equals(params.get("startDate")))
                    startDate = format.parse(params.get("startDate"));
                else if(s.equals("endDate") && !"".equals(params.get("endDate")))
                    endDate = format.parse(params.get("endDate"));
            }
        } catch (ParseException e) {
            startDate = endDate = null;
        }
        PageHelper.startPage(pageNum,pageSize);
        list = userMapper.selectAllUser(userNickName, startDate, endDate);
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
}
