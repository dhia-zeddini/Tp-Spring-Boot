package com.example.tp8_spring.service;

import com.example.tp8_spring.entity.Projet;
import com.example.tp8_spring.entity.ProjetDetail;
import com.example.tp8_spring.repository.ProjetDetailRepository;
import com.example.tp8_spring.repository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetService implements IProjetService{
    ProjetRepository projetRepository;
    ProjetDetailRepository projetDetailRepository;
    @Override
    public List<Projet> retrieveAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(Long projetId) {
        return projetRepository.findById(projetId).get();
    }

    @Override
    public Projet addProjet(Projet b) {
        return projetRepository.save(b);
    }

    @Override
    public void removeProjet(Long projetId) {
        projetRepository.deleteById(projetId);
    }

    @Override
    public Projet modifyProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet=projetRepository.findById(projetId).get();
        ProjetDetail projetDetail=projetDetailRepository.findById(projetDetailId).get();
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    @Override
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    @Override
    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }


}
