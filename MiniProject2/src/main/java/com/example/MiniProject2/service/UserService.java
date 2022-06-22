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
        //getUser 메서드는 아이디로 User 테이블을 조회하여 정보를 리턴
        return userRepository.findById(phone_number).get();
    }

    public UserEntity setUser(UserEntity user){
        return userRepository.save(user);
    }
    //setUser 메서드는 User 테이블에 데이터를 저장하는 기능을 수행
}
