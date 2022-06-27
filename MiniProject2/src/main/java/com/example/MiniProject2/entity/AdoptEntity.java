package com.example.MiniProject2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AdoptTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class AdoptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long Ano;

    @Column(name = "Rcode", length = 10, nullable = false)
    public String Rcode;

    @Column(name = "UserId", length = 20, nullable = false)
    public String UserId;

    @Column(name = "Title", length = 30, nullable = false)
    private String Title;

    @Column(name = "Contents",length = 10000, nullable = false)
    private String Contents;

    @Column(name = "Image",length = 10000)
    private Blob Image;

    @OneToMany
    @JoinColumn(name = "Ano")
    private Set<AReplyEntity> anoReplyEntitySet;
}
