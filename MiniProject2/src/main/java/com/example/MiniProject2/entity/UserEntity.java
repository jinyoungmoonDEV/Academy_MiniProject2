package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String phone_number;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String user_name;

    public UserEntity(String phone_number, String address, String user_name){
        this.phone_number = phone_number;
        this.address = address;
        this.user_name = user_name;
    }
}
