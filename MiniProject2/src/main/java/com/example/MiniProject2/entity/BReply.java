package com.example.MiniProject2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BReplyTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class BReply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long RBno;

    @Column(name = "Bno", nullable = false, unique = true)
    public long Bno;

    @Column(name = "BReply", length = 10, nullable = false)
    private String BReply;

    @Column(name = "UserID", length = 20, nullable = false)
    public String UserID;

}
