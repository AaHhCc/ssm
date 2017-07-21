package com.jyh.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.jyh.domain.User;
import com.jyh.service.UserService;
import com.jyh.utils.Binder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.json.Json;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by OverrideRe on 2017/7/6.
 *
 */
@Controller
@RequestMapping(value = "/user",method = {RequestMethod.GET, RequestMethod.POST})
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getAllUser.do")
    public @ResponseBody
    String getAllUser(@RequestParam String userId){
        User user = userService.findUserById(userId);
        System.out.println(user.toString());
        return JSON.toJSONString(user);
    }
}
