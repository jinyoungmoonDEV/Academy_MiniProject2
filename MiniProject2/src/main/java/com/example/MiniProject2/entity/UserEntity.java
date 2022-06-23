package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    private String phone_number;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    public String address;

    @Column(length = 15, nullable = false)
    public String user_id;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<AdoptEntity> adoptEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<BoardEntity> boardEntitySet;

    public UserEntity(String phone_number, String password, String address, String user_id){
        this.phone_number = phone_number;
        this.password = password;
        this.address = address;
        this.user_id = user_id;
    }
}