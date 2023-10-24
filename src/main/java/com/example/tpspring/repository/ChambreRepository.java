package com.example.tpspring.repository;

import com.example.tpspring.entity.Chambre;
import com.example.tpspring.entity.TypeChamber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findAllByNumeroChambreIsNull();
    Chambre findChambreByNumeroChambre(long numC);
    //List<Chambre> findAllByTypeChambre(TypeChamber type);
    long count();


}
