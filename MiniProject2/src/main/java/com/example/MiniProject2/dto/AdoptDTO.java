package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.Adopt;
import lombok.*;

import java.sql.Blob;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdoptDTO {
    public long Ano;
    public String RegionID;
    public String UserID;
    private String Title;
    private String Contents;
    private Blob Image;
    private LocalDateTime RegDate;
    private LocalDateTime ModDate;

    public AdoptDTO(final Adopt entity) {
        this.Ano = entity.getAno();
        this.RegionID = entity.getRegionID();
        this.UserID = entity.getUserID();
        this.Title = entity.getTitle();
        this.Contents = entity.getContents();
        this.Image = entity.getImage();
    }

    public static Adopt toEntity(final AdoptDTO dto) {
        return Adopt.builder()
                .Ano(dto.getAno())
                .UserID(dto.getUserID())
                .RegionID(dto.getRegionID())
                .Title(dto.getTitle())
                .Contents(dto.getContents())
                .Image(dto.getImage())
                .build();
    }
}
