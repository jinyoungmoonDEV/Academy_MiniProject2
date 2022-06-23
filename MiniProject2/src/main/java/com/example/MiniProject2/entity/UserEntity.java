package com.example.MiniProject2.entity;

import lombok.*;
import sun.security.util.Password;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    private String phone_number;

    @Column(length = 100, nullable = false)
    private Password password;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String user_id;

    @ManyToOne
    @JoinColumn(name = "RegionEntity")
    private RegionEntity regionEntity;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<AdobtEntity> adobtEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<BoardEntity> boardEntitySet;

    public UserEntity(String phone_number, String address, String user_name){
        this.phone_number = phone_number;
        this.address = address;
        this.user_name = user_name;
    }
}
