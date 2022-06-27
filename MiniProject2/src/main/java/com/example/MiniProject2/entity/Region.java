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
@Table(name = "RegionTbl"/*, uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")}*/)
public class Region {
    @Id
    @Column(name = "Rcode", length = 10, nullable = false)
    public String Rcode;

    @Column(name = "Address", length = 50, nullable = false)
    public String Address;

    @OneToMany
    @JoinColumn(name = "Rcode")
    private Set<Adopt> adoptSet;

    @OneToMany
    @JoinColumn(name = "Rcode")
    private Set<Board> boardSet;

    @OneToMany
    @JoinColumn(name = "Address")
    private List<User> userList;
}