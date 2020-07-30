package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
