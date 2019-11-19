package com.controller;

import com.pojo.Paper;
import com.pojo.User;
import com.service.PaperService;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserLoginController {
    @Autowired
    private PaperService paperService;
    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping(value = "/login")
    public String login(User user,Model model){
        User userInfo = userInfoService.queryUser(user);
        System.out.println(userInfo);
        if(userInfo != null){
            List<Paper> list = paperService.queryAllPaper();
            model.addAttribute("list", list);
            return "allPaper";
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
        List<Paper> list = paperService.queryAllPaper();
        model.addAttribute("list", list);
        return "allPaper";
    }
}
