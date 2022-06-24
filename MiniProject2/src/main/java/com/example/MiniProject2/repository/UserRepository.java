package com.example.MiniProject2.repository;

import com.example.MiniProject2.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {//JpaRepository<T,ID>인터페이스 상속 T에는 Entity ID에는 타입
    //UserRepository 인터페이스로 기본적으로 이미 만들어진 데이터베이스 API사용 가능 -> 이미 생성된 API를 사용하여 직접쿼리를 작성할 필요X
    UserEntity findByPhoneNumber(String phonenumber);
    Boolean existsByPhoneNumber(String phonenumber);
    UserEntity findByPhoneNumberAndPassword(String phonenumber, String password);
}
