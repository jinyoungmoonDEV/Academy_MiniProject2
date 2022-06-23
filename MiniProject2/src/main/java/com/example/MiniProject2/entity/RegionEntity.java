package com.example.MiniProject2.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "region_tbl")
@Getter
@Setter
public class RegionEntity {
    @Id
    @Column(length = 10, nullable = false)
    public String r_code;

    @Column(length = 50, nullable = false)
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