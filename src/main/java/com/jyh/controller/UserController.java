package com.jyh.controller;

import com.github.pagehelper.PageInfo;
import com.jyh.domain.User;
import com.jyh.service.UserService;
import com.jyh.utils.Binder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by OverrideRe on 2017/7/6.
 *
 */
@CrossOrigin(origins = "*")             //设置跨域权限，*表示允许所有跨域访问
@Controller
@RequestMapping(value = "/user",method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getAllUser")
    public @ResponseBody
    PageInfo<User> getAllUser(@RequestBody Map<String, String> params) throws Exception {
        PageInfo<User> userPaage = userService.selectAllUser(params);
        return userPaage;
    }
}
