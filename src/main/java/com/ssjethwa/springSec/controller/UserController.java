package com.ssjethwa.springSec.controller;

import com.ssjethwa.springSec.model.Users;
import com.ssjethwa.springSec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        userService.register(user);
        return user;
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verfiy(user);
    }
}
