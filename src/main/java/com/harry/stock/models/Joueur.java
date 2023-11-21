package com.harry.stock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_joueur;
    private String id_equipe;
    private String nom;
    private String prenom;
    private int numero;

    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public String getId_equipe() {
        return id_equipe;
    }

    public void setId_equipe(String id_equipe) {
        this.id_equipe = id_equipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
