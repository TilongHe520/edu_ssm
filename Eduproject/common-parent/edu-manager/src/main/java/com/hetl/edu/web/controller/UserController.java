package com.hetl.edu.web.controller;

import com.hetl.edu.model.User;
import com.hetl.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("包子");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "User/UserInfo";
    }

    @RequestMapping("salary")
    public String salary(){
        return "User/UserEdit";
    }

    @RequestMapping("edit")
    public String edit(){
        return "User/UserEdit";
    }
}
