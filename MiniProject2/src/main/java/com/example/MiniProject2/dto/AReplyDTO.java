package com.example.MiniProject2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AReplyDTO {

    private long RAno;
    public long Ano;
    private String AReply;
    public String UserID;
    private LocalDateTime RegDate;
    private LocalDateTime ModDate;
}
