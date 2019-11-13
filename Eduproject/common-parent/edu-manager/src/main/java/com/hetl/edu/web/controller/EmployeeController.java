package com.hetl.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @RequestMapping("manage")
    public String manage(){
        return "employee/manage";
    }
}
