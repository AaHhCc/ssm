package com.jyh.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jyh.dao.UserMapper;
import com.jyh.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by OverrideRe on 2017/7/6.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMyBatisTest {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Test
    public void testFindUser() throws Exception {
        User user = new User();
        user.setUserId("23234");
        user.setPassword("Yinghao");
        user.setUserName("Yinghao");
        user.setAddress("安庆市");

        int rows = userMapper.insertSelective(user);

        assertEquals(1, rows);
    }

    @Test
    public void selectUser() throws  Exception {
        PageHelper.startPage(1,5);
        List<User> users =  userMapper.selectAllUser("", new Date(), null);
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        long total = pageInfo.getTotal(); //获取总记录数
        System.out.println(total);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
