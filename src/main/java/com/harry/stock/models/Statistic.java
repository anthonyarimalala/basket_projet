package com.harry.stock.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_statistic;
    private String id_maatch;
    private int id_joueur;
    private int three_point;
    private int r_three_point;
    private int two_point;
    private int r_two_point;
    private int lancer_franc;
    private int r_lancer_franc;
    private int rebond;
    private int passe_decisive;

    public int getId_statistic() {
        return id_statistic;
    }

    public void setId_statistic(int id_statistic) {
        this.id_statistic = id_statistic;
    }

    public String getId_maatch() {
        return id_maatch;
    }

    public void setId_maatch(String id_maatch) {
        this.id_maatch = id_maatch;
    }

    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }

    public int getThree_point() {
        return three_point;
    }

    public void setThree_point(int three_point) {
        this.three_point = three_point;
    }

    public int getR_three_point() {
        return r_three_point;
    }

    public void setR_three_point(int r_three_point) {
        this.r_three_point = r_three_point;
    }

    public int getTwo_point() {
        return two_point;
    }

    public void setTwo_point(int two_point) {
        this.two_point = two_point;
    }

    public int getR_two_point() {
        return r_two_point;
    }

    public void setR_two_point(int r_two_point) {
        this.r_two_point = r_two_point;
    }

    public int getLancer_franc() {
        return lancer_franc;
    }

    public void setLancer_franc(int lancer_franc) {
        this.lancer_franc = lancer_franc;
    }

    public int getR_lancer_franc() {
        return r_lancer_franc;
    }

    public void setR_lancer_franc(int r_lancer_franc) {
        this.r_lancer_franc = r_lancer_franc;
    }

    public int getRebond() {
        return rebond;
    }

    public void setRebond(int rebond) {
        this.rebond = rebond;
    }

    public int getPasse_decisive() {
        return passe_decisive;
    }

    public void setPasse_decisive(int passe_decisive) {
        this.passe_decisive = passe_decisive;
    }
}
