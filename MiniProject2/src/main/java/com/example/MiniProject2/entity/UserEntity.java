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

    //@ManyToOne(targetEntity=RegionEntity.class)
    //@ManyToOne
    //@JoinColumn(name = "address")
    //private List<RegionEntity> regionEntityList;
    //private RegionEntity regionEntity;

    //@OneToMany(targetEntity=AdoptEntity.class)
    //@JoinColumn(name = "user_id")
    //private Set<AdoptEntity> adoptEntitySet;
    //private AdoptEntity adoptEntity;

    //@OneToMany(targetEntity=BoardEntity.class)
    //@JoinColumn(name = "user_id")
    //private Set<BoardEntity> boardEntitySet;
    //private BoardEntity boardEntity;

    public UserEntity(String phone_number, String address, String user_name){
        this.phone_number = phone_number;
        this.address = address;
        this.user_id = user_name;
    }
}
