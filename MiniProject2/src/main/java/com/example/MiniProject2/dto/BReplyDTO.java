package com.example.MiniProject2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BReplyDTO {

    private long RBno;
    public long Bno;
    private String BReply;
    public String UserID;
    private LocalDateTime RegDate;
    private LocalDateTime ModDate;

}
