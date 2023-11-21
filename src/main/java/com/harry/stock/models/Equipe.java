package com.harry.stock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_equipe;
    private String nom;
    private String localisation;

    public String getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(String id_equipe) {
        this.id_equipe = id_equipe;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}
