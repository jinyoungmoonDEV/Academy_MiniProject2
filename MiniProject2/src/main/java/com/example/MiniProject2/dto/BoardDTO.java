package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {

	public Long Bno;
	public String RegionID;
	public String UserID;
	private String Title;
	private String Contents;
	private Long Viewers;
	private Long Replycnt;
	private LocalDateTime RegDate;
	private LocalDateTime ModDate;

	public BoardDTO(final Board entity) {
		this.Bno = entity.getBno();
		this.RegionID = entity.getRegionID();
		this.UserID = entity.getUserID();
		this.Title= entity.getTitle();
		this.Viewers = entity.getViewers();
		this.Replycnt = entity.getReplycnt();
	}

	public static Board toEntity(final BoardDTO dto) {
		return Board.builder()
				.Bno(dto.getBno())
				.UserID(dto.getUserID())
				.RegionID(dto.getRegionID())
				.Title(dto.getTitle())
				.Viewers(dto.getViewers())
				.Replycnt(dto.getReplycnt())
				.build();
	}
}

