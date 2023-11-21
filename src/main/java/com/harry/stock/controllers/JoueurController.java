package com.harry.stock.controllers;

import com.harry.stock.models.Joueur;
import com.harry.stock.repositories.JoueurRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/joueur")
public class JoueurController {
    @Autowired
    private JoueurRepos joueurRepos;

    @GetMapping("/{id}")
    public Optional<Joueur> getJoueurById(@PathVariable Long id) { return joueurRepos.findById(id); }

    @GetMapping("/joueurs")
    public List<Joueur> getAllJoueur() { return joueurRepos.findAll(); }
}
