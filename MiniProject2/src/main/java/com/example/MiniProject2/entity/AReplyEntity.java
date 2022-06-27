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
public class AReplyEntity {
    @Id
    public long Ano;

    @Column(name = "AReply", length = 10000, nullable = false)
    private String AReply;

    @Column(name = "UserId", length = 20, nullable = false)
    public String UserId;

    @Column(name = "Date", length = 8, nullable = false)
    private LocalDate Date;
}
