package com.jyh.service;

import com.github.pagehelper.PageInfo;
import com.jyh.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by OverrideRe on 2017/7/6.
 */
public interface UserService {

    /**
     * 通过用户id查找用户
     *
     * @param userId 用户id
     * @return 用户对象
     */
    User findUserById(String userId);

    /**
     * 通过条件批量筛选用户
     *
     * @param params 参数集合
     * @return 分页的用户列表
     */
    PageInfo selectAllUser(Map<String, String> params);
}
