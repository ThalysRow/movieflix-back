package com.movieflix.movieflix.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "categories")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
}
