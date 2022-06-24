package com.example.MiniProject2.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String token;
    private String phone_number;
    private String password;
    private String address;
    private String user_id;
}
