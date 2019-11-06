package com.hetl.edu.service.impl;


import com.hetl.edu.mapper.UserMapper;
import com.hetl.edu.model.User;
import com.hetl.edu.service.IUserService;
import com.hetl.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User>  implements IUserService {

    @Override
    public User login(String username, String password) {
        return null;
    }
    //?????
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUId(String id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUId(String id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
