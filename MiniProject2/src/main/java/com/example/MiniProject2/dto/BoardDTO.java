package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {

	public Long Bno;
	public String Rcode;
	public String UserId;
	private String Title;
	private String Contents;
	private Long Viewers;
	private Long Replycnt;

	public BoardDTO(final Board entity) {
		this.Bno = entity.getBno();
		this.Rcode = entity.getRcode();
		this.UserId = entity.getUserId();
		this.Title= entity.getTitle();
		this.Viewers = entity.getViewers();
		this.Replycnt = entity.getReplycnt();
	}

	public static Board toEntity(final BoardDTO dto) {
		return Board.builder()
				.Bno(dto.getBno())
				.UserId(dto.getUserId())
				.Rcode(dto.getRcode())
				.Title(dto.getTitle())
				.Viewers(dto.getViewers())
				.Replycnt(dto.getReplycnt())
				.build();
	}
}

