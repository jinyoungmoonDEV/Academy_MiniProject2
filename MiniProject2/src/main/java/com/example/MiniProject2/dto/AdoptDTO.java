package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.AdoptEntity;
import com.example.MiniProject2.entity.BoardEntity;
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
    public long ano;
    public String r_code;
    public String user_id;
    private String title;
    private String contents;
    private Blob image;

    public AdoptDTO(final AdoptEntity entity) {
        this.ano = entity.getAno();
        this.r_code = entity.getR_code();
        this.user_id = entity.getUser_id();
        this.title = entity.getTitle();
        this.contents = entity.getContents();
        this.image = entity.getImage();
    }

    public static AdoptEntity toEntity(final AdoptDTO dto) {
        return AdoptEntity.builder()
                .ano(dto.getAno())
                .user_id(dto.getUser_id())
                .r_code(dto.getR_code())
                .title(dto.getTitle())
                .contents(dto.getContents())
                .image(dto.getImage())
                .build();
    }
}
