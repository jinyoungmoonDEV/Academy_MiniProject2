package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.codec.ServerSentEvent;

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

	public BoardDTO(final BoardEntity entity) {
		this.Bno = entity.getBno();
		this.Rcode = entity.getRcode();
		this.UserId = entity.getUserId();
		this.Title= entity.getTitle();
		this.Viewers = entity.getViewers();
		this.Replycnt = entity.getReplycnt();
	}

	public static BoardEntity toEntity(final BoardDTO dto) {
		return BoardEntity.builder()
				.Bno(dto.getBno())
				.UserId(dto.getUserId())
				.Rcode(dto.getRcode())
				.Title(dto.getTitle())
				.Viewers(dto.getViewers())
				.Replycnt(dto.getReplycnt())
				.build();
	}
}

