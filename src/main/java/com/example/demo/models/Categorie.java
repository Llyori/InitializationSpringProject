package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom")
    private String nom;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Categorie() {}

    public Categorie(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
