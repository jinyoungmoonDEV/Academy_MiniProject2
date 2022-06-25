package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    @Column(name = "phone_number", length = 11)
    private String phone_number;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "address", length = 100, nullable = false)
    public String address;

    @Column(name = "user_id", length = 10, nullable = false)
    public String user_id;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<AdoptEntity> adobtEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<BoardEntity> boardEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<AReplyEntity> aReplyEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<BReplyEntity> bReplyEntitySet;
}
