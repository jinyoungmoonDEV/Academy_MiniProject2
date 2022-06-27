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
@Table(name = "breply_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class BReplyEntity {


    @Id
    private long rbno;

    @Column(name = "bno", nullable = false)
    public long bno;

    @Column(name = "breply", length = 10, nullable = false)
    private String breply;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;

    @Column(name = "date", length = 8, nullable = false)
    private LocalDate date;
}
