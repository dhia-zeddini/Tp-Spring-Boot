package com.example.tp8_spring.service;

import com.example.tp8_spring.entity.Equipe;
import com.example.tp8_spring.repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService{
    EquipeRepository equipeRepository;
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
}
