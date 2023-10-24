package com.example.tpspring.repository;

import com.example.tpspring.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite findByNomUniversite(String nomU);
    long count();
    Universite addUniversite(Universite c);
    Universite modifyUniversite(Universite c);
    void removeUniversite(Long universiteId);
}
