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

	public Long bno;
	public String r_code;
	public String user_id;
	private String title;
	private String contents;
	private Long viewers;
	private Long replycnt;

	public BoardDTO(final BoardEntity entity) {
		this.bno = entity.getBno();
		this.r_code = entity.getR_code();
		this.user_id = entity.getUser_id();
		this.title = entity.getTitle();
		this.viewers = entity.getViewers();
		this.replycnt = entity.getReplycnt();
	}

	public static BoardEntity toEntity(final BoardDTO dto) {
		return BoardEntity.builder()
				.bno(dto.getBno())
				.user_id(dto.getUser_id())
				.r_code(dto.getR_code())
				.title(dto.getTitle())
				.viewers(dto.getViewers())
				.replycnt(dto.getReplycnt())
				.build();
	}
}

