package com.example.MiniProject2.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")})
public class UserDTO {
    private String phone_number;
    private String password;
    private String address;
    private String user_id;
}
