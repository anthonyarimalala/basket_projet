package com.harry.stock.repositories;

import com.harry.stock.models.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepos extends JpaRepository<Equipe, Long> {
}
