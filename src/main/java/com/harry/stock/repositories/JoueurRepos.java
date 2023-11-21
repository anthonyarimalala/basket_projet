package com.harry.stock.repositories;

import com.harry.stock.models.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepos extends JpaRepository<Joueur, Long> {
}
