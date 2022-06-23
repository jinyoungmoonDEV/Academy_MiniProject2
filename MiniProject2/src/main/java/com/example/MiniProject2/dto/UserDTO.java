package com.example.MiniProject2.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
public class UserDTO {
    private String phone_number;
    private String password;
    private String address;
    private String user_id;
}
