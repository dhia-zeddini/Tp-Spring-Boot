package com.example.tp8_spring.controller;

import com.example.tp8_spring.entity.Equipe;
import com.example.tp8_spring.service.IEquipeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion equipe")

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {
    IEquipeService equipeService;

    @GetMapping("/retrive-all-equipes")
    public List<Equipe> getEquipes(){
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }
    @GetMapping("/get-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe b) {
        return equipeService.addEquipe(b);
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") Long equipeId) {
        equipeService.removeEquipe(equipeId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-equipe")
    public Equipe modifyEquipe(@RequestBody Equipe b) {
        return equipeService.modifyEquipe(b);
    }
    @PutMapping("/affecter-projet-equipe/{projet-id}/{equipe-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId, @PathVariable("equipe-id") Long equipeId) {
        equipeService.assignProjetToEquipe(proejtId,equipeId);
    }

    @PutMapping("/desaffecter-projet-de-equipe/{projet-id}/{equipe-id}")

    public void desaffecterProjetFromEquipe(@PathVariable("projet-id") Long projetId, @PathVariable("equipe-id") Long equipeId) {
       equipeService.desaffecterProjetFromEquipe(projetId,equipeId);
    }
}
