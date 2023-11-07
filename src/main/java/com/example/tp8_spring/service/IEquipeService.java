package com.example.tp8_spring.service;


import com.example.tp8_spring.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();
    public Equipe retrieveEquipe(Long equipeId);
    public Equipe addEquipe(Equipe b);
    public void removeEquipe(Long equipeId);
    public Equipe modifyEquipe(Equipe equipe);
    public void assignProjetToEquipe(Long projetId, Long equipeId);

    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId);
}
