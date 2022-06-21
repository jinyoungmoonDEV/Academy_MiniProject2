package com.example.MiniProject2.service;

import com.example.MiniProject2.entity.UserEntity;
import com.example.MiniProject2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity getUser(String phone_number, String address, String username){
        return userRepository.findById(phone_number).get();
    }

    public UserEntity setUser(UserEntity user){
        return userRepository.save(user);
    }
}
