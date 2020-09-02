package com.example.deng.controller;

import com.example.deng.entity.User;
import com.example.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get")
    public User getUserById (Long id) {
        User user = userService.getUserById(id);
        return user;
    }
}
