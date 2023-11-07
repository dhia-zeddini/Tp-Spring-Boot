package com.example.tp8_spring.service;

import com.example.tp8_spring.entity.Equipe;
import com.example.tp8_spring.entity.Projet;
import com.example.tp8_spring.repository.EquipeRepository;
import com.example.tp8_spring.repository.ProjetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService{
    EquipeRepository equipeRepository;
    ProjetRepository projetRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipe(Long equipeId) {
        return equipeRepository.findById(equipeId).get();
    }

    @Override
    public Equipe addEquipe(Equipe b) {
        return equipeRepository.save(b);
    }

    @Override
    public void removeEquipe(Long equipeId) {
        equipeRepository.deleteById(equipeId);
    }

    @Override
    public Equipe modifyEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

    @Override
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }
}
