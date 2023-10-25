package com.example.tpspring.service;

import com.example.tpspring.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
