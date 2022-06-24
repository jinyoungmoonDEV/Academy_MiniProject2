package com.example.MiniProject2.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "region_tbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class RegionEntity {
    @Id
    @Column(name = "r_code", length = 10, nullable = false)
    public String r_code;

    @Column(name = "address", length = 50, nullable = false)
    public String address;

    @OneToMany
    @JoinColumn(name = "r_code")
    private Set<AdoptEntity> adoptEntitySet;

    @OneToMany
    @JoinColumn(name = "r_code")
    private Set<BoardEntity> boardEntitySet;

    @OneToMany
    @JoinColumn(name = "address")
    private List<UserEntity> userEntityList;
}