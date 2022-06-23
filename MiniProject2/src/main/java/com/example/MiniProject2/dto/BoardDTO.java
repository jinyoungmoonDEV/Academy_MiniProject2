package com.example.MiniProject2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {

    private Long ano;
    private String r_code;
    private String user_id;
    private String title;
    private String contents;
    private String reply;
    private LocalDateTime regDate, modDate;
    private long viewers;

}
