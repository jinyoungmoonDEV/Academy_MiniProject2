package com.example.MiniProject2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "breply_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class BReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bno;

    @Column(name = "breply", length = 10, nullable = false)
    public String contents;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;
}
