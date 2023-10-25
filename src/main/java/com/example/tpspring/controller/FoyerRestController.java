package com.example.tpspring.controller;

import com.example.tpspring.entity.Foyer;
import com.example.tpspring.service.IFoyerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name="Gestion foyer")

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")

public class FoyerRestController {

    IFoyerService foyerService;

    @Operation(description = "recuperer tous les foyer")
    @GetMapping("/retrive-all-foyers")
    public List<Foyer> getFoyers(){
        List<Foyer> listFoyers = foyerService.retrieveAllFoyer();
        return listFoyers;
    }
    @GetMapping("/get-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.retrieveFoyer(chId);
        return foyer;
    }
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.addFoyer(c);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.removeFoyer(chId);
    }
    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.modifyFoyer(c);
        return foyer;
    }
}
