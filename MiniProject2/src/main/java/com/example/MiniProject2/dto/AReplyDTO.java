package com.example.MiniProject2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AReplyDTO {
    public long Ano;
    private String AReply;
    public String UserId;
    private LocalDate Date;
}
