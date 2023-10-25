package com.example.tpspring.controller;

import com.example.tpspring.entity.Etudiant;
import com.example.tpspring.service.IEtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion etudiant")

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")

public class EtudiantRestController {

    IEtudiantService etudiantService;

    @Operation(description = "recuperer tous les etudiant")
    @GetMapping("/retrive-all-etudiants")
    public List<Etudiant> getEtudiants(){
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiant();
        return listEtudiants;
    }
    @GetMapping("/get-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long chId) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(chId);
        return etudiant;
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.addEtudiant(c);
        return etudiant;
    }
    // http://localhost:8089/tpetudiant/etudiant/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long chId) {
        etudiantService.removeEtudiant(chId);
    }
    // http://localhost:8089/tpetudiant/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.modifyEtudiant(c);
        return etudiant;
    }
}
