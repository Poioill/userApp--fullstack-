package com.example.fullstack.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usr")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String username;
    private String name;
}
