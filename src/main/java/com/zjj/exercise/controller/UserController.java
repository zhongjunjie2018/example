package com.zjj.exercise.controller;

import com.zjj.exercise.model.UserModel;
import com.zjj.exercise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/removeUser")
    public void removeUser(String username){
        System.out.println("this is removeUser controller:  "+username);
        userService.removeUser(username);
    }
    @RequestMapping("/queryUser")
    public Object getUser(String username){
        System.out.println("this is queryUser controller:  "+username);
        return userService.queryUser(username);
    }
}
