package com.yuan.service.impl;

import com.yuan.dao.UserDao;
import com.yuan.pojo.User;
import com.yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
