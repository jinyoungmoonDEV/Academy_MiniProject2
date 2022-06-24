package com.example.MiniProject2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "board_tbl")
@Getter
@Setter
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ano;

    @Column(name = "r_code", length = 10, nullable = false)
    public String r_code;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;

    @Column(name = "title", length = 30, nullable = false)
    private String title;

    @Column(name = "contents",length = 10000, nullable = false)
    private String contents;

    @Column(name = "viewers", length = 10, nullable = false)
    private long viewers;
}
