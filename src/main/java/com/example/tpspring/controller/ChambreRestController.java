package com.example.tpspring.controller;

import com.example.tpspring.entity.Chambre;
import com.example.tpspring.service.IChambreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    IChambreService chambreService;

    @Operation(description = "recuperer toutes les chambre")
    @GetMapping("/retrive-all-chambres")
    public List<Chambre> getChambres(){
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }
    @GetMapping("/get-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }
}