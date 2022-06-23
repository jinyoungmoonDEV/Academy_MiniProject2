package com.example.MiniProject2.controller;

import com.example.MiniProject2.entity.UserEntity;
import com.example.MiniProject2.repository.UserRepository;
import com.example.MiniProject2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/templates")
public class UserController {
    @Autowired
    private UserService userService;

    private UserRepository userRepository;

    @GetMapping (value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity signup(@RequestBody UserEntity reqBody){
        UserEntity user = userService.setUser(reqBody);
        return user;
    }

    @GetMapping (value = "/userin")
    public UserEntity signin(@RequestBody UserEntity reqBody) {
        String phone_number = reqBody.getPhone_number();
        String password = reqBody.getPassword();
        String address = reqBody.getAddress();
        String user_id = reqBody.getUser_id();
        UserEntity user = userService.getUser(phone_number, password, address, user_id);
        return user;
    }

    @GetMapping(value = "/signup")
    public String signuppage() {
        return "SignUp";
    }

    @GetMapping(value = "/signin")
    public String signinpage() {
        return "SignIn";
    }

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

/*    @RequestMapping("/")
    public String index(){
        return "";
    }*/
}
