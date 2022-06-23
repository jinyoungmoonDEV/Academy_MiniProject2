package com.example.MiniProject2.controller;

import com.example.MiniProject2.entity.UserEntity;
import com.example.MiniProject2.repository.UserRepository;
import com.example.MiniProject2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    private UserRepository userRepository;

    @RequestMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity signup(@RequestBody UserEntity reqBody){
        UserEntity user = userService.setUser(reqBody);
        return user;
    }

    @PostMapping("/signin")
    public UserEntity login(@RequestBody UserEntity reqBody) {
        String phone_number = reqBody.getPhone_number();
        String address = reqBody.getAddress();
        String user_name = reqBody.getUser_name();
        UserEntity user = userService.getUser(phone_number,address,user_name);
        return user;
    }

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
