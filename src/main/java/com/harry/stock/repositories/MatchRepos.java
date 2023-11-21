package com.harry.stock.repositories;

import com.harry.stock.models.Maatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepos extends JpaRepository<Maatch, Long> {
}
