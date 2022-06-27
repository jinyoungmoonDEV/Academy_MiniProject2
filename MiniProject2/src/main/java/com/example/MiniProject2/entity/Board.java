package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BoardTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Bno;

    @Column(name = "RegionID", length = 10, nullable = false)
    public String RegionID;

    @Column(name = "UserID", length = 20, nullable = false)
    public String UserID;

    @Column(name = "Title", length = 30, nullable = false)
    private String Title;

    @Column(name = "Contents",length = 10000, nullable = false)
    private String Contents;

    @Column(name = "Viewers", length = 10)
    private long Viewers;

    @Column(name = "Replycnt")
    private long Replycnt;

    @OneToMany
    @JoinColumn(name = "Bno")
    private Set<BReply> bnoReplyEntitySet;
}
