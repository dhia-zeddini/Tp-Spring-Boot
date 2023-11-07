package com.example.tp8_spring.service;

import com.example.tp8_spring.entity.ProjetDetail;
import com.example.tp8_spring.repository.ProjetDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailService implements IProjetDetailService{
    ProjetDetailRepository pdRepository;
    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return pdRepository.findAll();
    }

    @Override
    public ProjetDetail retrieveProjetDetail(Long pdId) {
        return pdRepository.findById(pdId).get();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail b) {
        return pdRepository.save(b);
    }

    @Override
    public void removeProjetDetail(Long pdId) {
        pdRepository.deleteById(pdId);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail pd) {
        return pdRepository.save(pd);
    }
}
