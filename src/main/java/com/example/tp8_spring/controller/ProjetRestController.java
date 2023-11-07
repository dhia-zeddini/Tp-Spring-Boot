package com.example.tp8_spring.controller;

import com.example.tp8_spring.entity.Projet;
import com.example.tp8_spring.service.IProjetService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion projet")

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {
    IProjetService projetService;

    @GetMapping("/retrive-all-projets")
    public List<Projet> getProjets() {
        List<Projet> listProjets = projetService.retrieveAllProjets();
        return listProjets;
    }

    @GetMapping("/get-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") Long projetId) {
        return projetService.retrieveProjet(projetId);
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet b) {
        return projetService.addProjet(b);
    }

    @PostMapping("/add-projet-et-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet b) {
        return projetService.addProjetAndProjetDetailAndAssign(b);
    }

    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long projetId) {
        projetService.removeProjet(projetId);
    }

    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet b) {
        return projetService.modifyProjet(b);
    }


    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")

    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long projetId, @PathVariable("projet-details-id") Long projetDetailsId) {
        projetService.assignProjetDetailToProjet(projetId, projetDetailsId);
    }

    @PostMapping("/add-project-and-assign-detail/{projet-details-id}")
    public Projet addProjetAndAssignProjetToProjetDetail(@RequestBody Projet p,@PathVariable("projet-details-id") Long projetDetailsId){
       return projetService.addProjetAndAssignProjetToProjetDetail(p,projetDetailsId);
    }

    @PutMapping("/desaffect-a-projet-details/{projet-id}")
    public void DesaffecterProjetDetailFromProjet( @PathVariable("projet-id") Long projetId) {
        projetService.DesaffecterProjetDetailFromProjet( projetId);
    }

}
