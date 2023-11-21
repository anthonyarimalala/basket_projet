package com.harry.stock.controllers;

import com.harry.stock.models.Equipe;
import com.harry.stock.repositories.EquipeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private EquipeRepos equipeRepos;

    @GetMapping("/{id}")
    public Optional<Equipe> getEquipeById(@PathVariable Long id) { return equipeRepos.findById(id); }

    @GetMapping("/equipes")
    public List<Equipe> getAllEquipe() { return equipeRepos.findAll(); }
}
