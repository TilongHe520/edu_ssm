package com.controller;

import com.pojo.User;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/login.action")
    public String login(User user){
        User userInfo = userInfoService.queryUser(user);
        System.out.println(userInfo);
        if(userInfo != null){
            return "allPaper";
        }
        else {
            return "addPaper";
        }
    }

    @RequestMapping(value = "/toLogin.action")
    public String toLogin() {
        return "login";
    }
}