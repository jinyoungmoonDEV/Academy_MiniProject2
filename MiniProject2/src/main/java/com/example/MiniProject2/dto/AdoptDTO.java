package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.Adopt;
import lombok.*;

import java.sql.Blob;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdoptDTO {
    public long Ano;
    public String Rcode;
    public String UserId;
    private String Title;
    private String Contents;
    private Blob Image;

    public AdoptDTO(final Adopt entity) {
        this.Ano = entity.getAno();
        this.Rcode = entity.getRcode();
        this.UserId = entity.getUserId();
        this.Title = entity.getTitle();
        this.Contents = entity.getContents();
        this.Image = entity.getImage();
    }

    public static Adopt toEntity(final AdoptDTO dto) {
        return Adopt.builder()
                .Ano(dto.getAno())
                .UserId(dto.getUserId())
                .Rcode(dto.getRcode())
                .Title(dto.getTitle())
                .Contents(dto.getContents())
                .Image(dto.getImage())
                .build();
    }
}
