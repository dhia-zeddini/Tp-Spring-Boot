package com.example.tp8_spring.service;


import com.example.tp8_spring.entity.Projet;

import java.util.List;

public interface IProjetService {
    public List<Projet> retrieveAllProjets();
    public Projet retrieveProjet(Long projetId);
    public Projet addProjet(Projet b);
    public void removeProjet(Long projetId);
    public Projet modifyProjet(Projet projet);
    public Projet addProjetAndProjetDetailAndAssign(Projet projet);
    public void assignProjetDetailToProjet(Long projetId,Long projetDetailId);
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);
    public Projet DesaffecterProjetDetailFromProjet(Long projetId);


}
