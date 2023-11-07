package com.example.tp8_spring.service;


import com.example.tp8_spring.entity.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public List<ProjetDetail> retrieveAllProjetDetails();
    public ProjetDetail retrieveProjetDetail(Long pdId);
    public ProjetDetail addProjetDetail(ProjetDetail b);
    public void removeProjetDetail(Long pdId);
    public ProjetDetail modifyProjetDetail(ProjetDetail pd);
}
