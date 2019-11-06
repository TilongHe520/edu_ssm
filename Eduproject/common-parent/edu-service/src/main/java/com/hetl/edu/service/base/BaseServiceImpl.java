package com.hetl.edu.service.base;

import com.hetl.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
    //所有的dao
    @Autowired
    protected UserMapper userMapper;
}
