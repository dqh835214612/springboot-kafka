package com.example.deng.service.impl;

import com.example.deng.entity.User;
import com.example.deng.mapper.UserMapper;
import com.example.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
