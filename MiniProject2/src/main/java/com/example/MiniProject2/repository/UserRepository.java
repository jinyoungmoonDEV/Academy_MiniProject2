package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByPhoneNumber(String PhoneNumber);
    Boolean existsByPhoneNumber(String PhoneNumber);
    UserEntity findByPhoneNumberAndPassWord(String PhoneNumber, String PasseWord);
}
