package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "areply_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class AReplyEntity {
    @Id
    public long ano;

    @Column(name = "areply", length = 10000, nullable = false)
    private String areply;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;

    @Column(name = "date", length = 8, nullable = false)
    private LocalDate date;
}
