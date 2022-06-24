package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "areply_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class AReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bno;

    @Column(name = "areply", length = 10, nullable = false)
    public String contents;

    @Column(name = "user_id", length = 20, nullable = false)
    public String user_id;
}
