package com.hetl.edu.service;

import com.hetl.edu.model.User;
import com.hetl.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {
    //特有的方法
    public User login(String username,String password);
}
