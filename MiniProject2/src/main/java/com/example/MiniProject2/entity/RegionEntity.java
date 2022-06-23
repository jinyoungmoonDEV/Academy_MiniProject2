package com.example.MiniProject2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "region_tbl")
@Getter
@Setter
public class RegionEntity {

    private String address;

    @Id
    private String r_code;

    @OneToMany
    @JoinColumn(name = "r_code")
    private Set<AdobtEntity> adobtEntitySet;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<UserEntity> userEntitySet;
}
