package com.example.MiniProject2.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
//@RequiredArgsConstructor
public class UserDTO {
    private String phone_number;
    private String address;
    private String user_name;
}
