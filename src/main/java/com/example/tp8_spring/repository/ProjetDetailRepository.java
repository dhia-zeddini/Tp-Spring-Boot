package com.example.tp8_spring.repository;

import com.example.tp8_spring.entity.Projet;
import com.example.tp8_spring.entity.ProjetDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail,Long> {
}
