package com.jyh.controller;

import com.jyh.domain.User;
import com.jyh.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by OverrideRe on 2017/7/6.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public String getUser(Model model) throws Exception {
        User user = userService.findUserById("111");
        model.addAttribute("user", user);
        return "userInfo";
    }
}
