package com.controller;

import com.pojo.User;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/login")
    public String login(User user){
        User userInfo = userInfoService.queryUser(user);
        System.out.println(userInfo);
        if(userInfo != null){
            return "login/success1";
        }
        else {
            return "login/fail";
        }
    }

    @RequestMapping(value = "/toLogin.action")
    public String toLogin() {
        return "login/login";
    }

    @RequestMapping("/register")
    public String register(){
        return "login/register";
    }
    @RequestMapping("/doRegister")
    public String doRegister(User user, Model model){
        System.out.println(user.getUsername());
        userInfoService.registerUser(user);
        return "login/success1";
    }
}
