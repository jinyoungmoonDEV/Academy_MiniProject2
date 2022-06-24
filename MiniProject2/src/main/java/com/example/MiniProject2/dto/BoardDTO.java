package com.example.MiniProject2.dto;

import com.example.MiniProject2.entity.BoardEntity;
import com.example.demo.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {
	private String id;
	private String title;
	private boolean done;

	public BoardDTO(final BoardEntity entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.done = entity.isDone();
	}

	public static BoardEntity toEntity(final BoardDTO dto) {
		return BoardEntity.builder()
						.id(dto.getId())
						.title(dto.getTitle())
						.done(dto.isDone())
						.build();
	}
}

