package com.harry.stock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Maatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_maatch;
    private String date_maatch;
    private String equipe_local;
    private String equipe_visiteur;

    public String getId_maatch() {
        return id_maatch;
    }

    public void setId_maatch(String id_maatch) {
        this.id_maatch = id_maatch;
    }

    public String getDate_maatch() {
        return date_maatch;
    }

    public void setDate_maatch(String date_maatch) {
        this.date_maatch = date_maatch;
    }

    public String getEquipe_local() {
        return equipe_local;
    }

    public void setEquipe_local(String equipe_local) {
        this.equipe_local = equipe_local;
    }

    public String getEquipe_visiteur() {
        return equipe_visiteur;
    }

    public void setEquipe_visiteur(String equipe_visiteur) {
        this.equipe_visiteur = equipe_visiteur;
    }
}
