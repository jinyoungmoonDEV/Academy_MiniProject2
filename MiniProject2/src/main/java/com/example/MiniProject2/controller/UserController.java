package com.example.MiniProject2.controller;

import com.example.MiniProject2.entity.UserEntity;
import com.example.MiniProject2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/signup/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity signup(@RequestBody UserEntity reqBody){
        UserEntity user = userServiceImpl.setUser(reqBody);
        return user;
    }

    @PostMapping("/signin")
    public UserEntity login(@RequestBody UserEntity reqBody) {
        String phone_number = reqBody.getPhone_number();
        String address = reqBody.getAddress();
        String user_name = reqBody.getUser_name();
        UserEntity user = userServiceImpl.getUser(phone_number,address,user_name);
        return user;
    }
}
