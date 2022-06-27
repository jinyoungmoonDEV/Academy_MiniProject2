package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class UserEntity { //데이터베이스 테이블의 스키마
    @Id
    @Column(name = "PhoneNumber", length = 11)
    private String PhoneNumber;

    @Column(name = "PassWord", length = 100, nullable = false)
    private String PassWord;

    @Column(name = "Address", length = 100, nullable = false)
    public String Address;

    @Column(name = "UserId", length = 10, nullable = false)
    public String UserId;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<AdoptEntity> adobtEntitySet;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<BoardEntity> boardEntitySet;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<AReplyEntity> aReplyEntitySet;

    @OneToMany
    @JoinColumn(name = "UserId")
    private Set<BReplyEntity> bReplyEntitySet;
}
