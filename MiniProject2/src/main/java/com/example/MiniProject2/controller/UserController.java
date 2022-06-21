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

    @PostMapping("sign in")
    public UserEntity signin(@RequestBody UserEntity reqBody){
        String phone_number = reqBody.getPhone_number();
        String address = reqBody.getAddress();
        String username = reqBody.getUser_name();
        UserEntity user = userServiceImpl.getUser(phone_number,address,username);
        return user;
    }

    @PostMapping("signup")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity signup(@RequestBody UserEntity reqBody) {
        UserEntity user = userServiceImpl.setUser(reqBody);
        return user;
    }
}
