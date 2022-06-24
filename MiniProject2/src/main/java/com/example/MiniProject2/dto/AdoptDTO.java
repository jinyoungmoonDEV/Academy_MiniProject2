package com.example.MiniProject2.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.sql.Blob;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdoptDTO {
    private long ano;
    private String r_code;
    private String user_id;
    private String title;
    private String contents;
    private Blob image;
}
