package com.example.tp8_spring.repository;

import com.example.tp8_spring.entity.Equipe;
import com.example.tp8_spring.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
