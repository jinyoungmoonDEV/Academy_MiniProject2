package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String phone_number;

    @Column(length = 100, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String user_name;
}
