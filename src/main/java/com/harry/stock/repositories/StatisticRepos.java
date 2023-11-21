package com.harry.stock.repositories;

import com.harry.stock.models.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepos extends JpaRepository<Statistic, Long> {
}
