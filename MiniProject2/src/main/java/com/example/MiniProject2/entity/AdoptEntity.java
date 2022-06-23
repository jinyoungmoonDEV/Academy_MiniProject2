package com.example.MiniProject2.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.List;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "adopt_tbl")
@Getter
@Setter
public class AdoptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ano;

    @Column(length = 10, nullable = false)
    public String r_code;

    @Column(length = 20, nullable = false)
    public String user_id;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 10000, nullable = false)
    private String contents;

    @Column(nullable = false)
    private List image;

    @Column(length = 100, nullable = false)
    private String reply;

    @Column(length = 10, nullable = false)
    private long viewers;
}
