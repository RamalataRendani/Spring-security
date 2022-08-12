package com.example.Demologin.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role(){

    }
}
