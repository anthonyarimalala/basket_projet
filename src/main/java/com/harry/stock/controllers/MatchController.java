package com.harry.stock.controllers;

import com.harry.stock.models.Maatch;
import com.harry.stock.repositories.MatchRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    private MatchRepos matchRepos;

    @GetMapping("/{id}")
    public Optional<Maatch> getMatchById(@PathVariable Long id) { return matchRepos.findById(id); }

    @GetMapping("/matchs")
    public List<Maatch> getAllMatch() { return matchRepos.findAll(); }
}
