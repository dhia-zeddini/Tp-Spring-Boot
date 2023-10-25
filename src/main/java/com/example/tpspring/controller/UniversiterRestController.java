package com.example.tpspring.controller;

import com.example.tpspring.entity.Universite;
import com.example.tpspring.service.IUniversiteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion universite")

@RestController
@AllArgsConstructor
@RequestMapping("/universite")

public class UniversiterRestController {

    IUniversiteService universiteService;

    @Operation(description = "recuperer tous les universite")
    @GetMapping("/retrive-all-universites")
    public List<Universite> getUniversites(){
        List<Universite> listUniversites = universiteService.retrieveAllUniversite();
        return listUniversites;
    }
    @GetMapping("/get-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId) {
        Universite universite = universiteService.retrieveUniversite(chId);
        return universite;
    }
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.addUniversite(c);
        return universite;
    }
    // http://localhost:8089/tpuniversite/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long chId) {
        universiteService.removeUniversite(chId);
    }
    // http://localhost:8089/tpuniversite/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.modifyUniversite(c);
        return universite;
    }
}
