package com.jyh.dao;

import com.jyh.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by OverrideRe on 2017/7/6.
 *用户的dao层
 */
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 通过条件批量筛选用户
     * @param userNickName  用户名
     * @param startDate  开始时间
     * @param endDate  结束时间
     * @return 用户列表
     */
    List<User> selectAllUser(@Param("nickName") String userNickName, @Param("startDate") Date startDate,
                             @Param("endDate") Date endDate);


}