package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AReplyTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class AReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RAno;

    @Column(name = "Ano", nullable = false, unique = true)
    public long Ano;

    @Column(name = "AReply", length = 10000, nullable = false)
    private String AReply;

    @Column(name = "UserID", length = 20, nullable = false)
    public String UserID;

}
