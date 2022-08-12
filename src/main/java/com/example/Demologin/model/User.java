package com.example.Demologin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Table(name ="user")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "user_role",
    joinColumns =@JoinColumn(name ="user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(){
    }
    public User(String username, String email, String password ){
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
