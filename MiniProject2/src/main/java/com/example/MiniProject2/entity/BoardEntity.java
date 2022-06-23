package com.example.MiniProject2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "board_tbl")
@Getter
@Setter
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ano;

    @Column
    private String r_code;

    @Column
    private String user_id;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String reply;

    @Column
    private LocalDate date;

    @Column
    private long viewers;

    @ManyToOne
    @JoinColumn(name = "r_code")
    private RegionEntity regionEntity;

    @ManyToMany
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
