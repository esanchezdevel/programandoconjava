package com.programandoconjava.infrastructure.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programandoconjava.domain.model.Stat;

public interface StatsRepository extends JpaRepository<Stat, Long>{

}
