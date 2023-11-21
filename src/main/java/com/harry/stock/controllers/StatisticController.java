package com.harry.stock.controllers;

import com.harry.stock.models.Statistic;
import com.harry.stock.repositories.StatisticRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/statistic")
public class StatisticController {
    @Autowired
    private StatisticRepos statisticRepos;

    @GetMapping("/{id}")
    public Optional<Statistic> getStatisticById(@PathVariable Long id) { return statisticRepos.findById(id); }

    @GetMapping("/statistics")
    public List<Statistic> getAllStatistic() { return statisticRepos.findAll(); }
}
