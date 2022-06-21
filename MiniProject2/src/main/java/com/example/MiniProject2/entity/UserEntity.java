package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity {
    @Id
    @Column(length = 13, nullable = false)
    private String phone_number;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String user_name;
}
