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
    @Column(length = 11)
    private String phone_number;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 10, nullable = false)
    private String user_name;
}
