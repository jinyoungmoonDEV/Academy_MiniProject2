package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @Column(name = "user_id", length = 15, nullable = false)
    private String user_id;

    @ManyToOne
    @JoinColumn(name = "RegionEntity")
    private RegionEntity regionEntity;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<AdoptEntity> adobtEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<BoardEntity> boardEntitySet;

    public UserEntity(String phone_number, String password, String address, String user_name){
        this.phone_number = phone_number;
        this.password = password;
        this.address = address;
        this.user_id = user_name;
    }
}
