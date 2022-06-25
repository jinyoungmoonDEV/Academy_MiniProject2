package com.example.MiniProject2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BReplyDTO {
    public long bno;
    private String breply;
    public String user_id;
    private LocalDate date;
}
