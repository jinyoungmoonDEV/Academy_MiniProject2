package com.example.MiniProject2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "adopt_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class AdoptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long ano;

    @Column(name = "r_code", length = 10, nullable = false)
    public String r_code;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;

    @Column(name = "title", length = 30, nullable = false)
    private String title;

    @Column(name = "contents",length = 10000, nullable = false)
    private String contents;

    @Column(name = "image",length = 10000)
    private Blob image;

    @OneToMany
    @JoinColumn(name = "ano")
    private Set<AReplyEntity> anoReplyEntitySet;
}
