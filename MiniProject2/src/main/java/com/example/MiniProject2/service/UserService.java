package com.example.MiniProject2.service;

import com.example.MiniProject2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public interface UserService {
    @Autowired
    private final UserRepository userRepository;

    public boolean login(User user){
        User finduser = userRepository.findById(us)
    }
}
