package com.example.tp8_spring.controller;

import com.example.tp8_spring.entity.ProjetDetail;
import com.example.tp8_spring.service.IProjetDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Gestion pd")

@RestController
@AllArgsConstructor
@RequestMapping("/pd")
public class ProjetDetailRestController {
    IProjetDetailService pdService;

    @GetMapping("/retrive-all-pds")
    public List<ProjetDetail> getProjetDetails(){
        List<ProjetDetail> listProjetDetails = pdService.retrieveAllProjetDetails();
        return listProjetDetails;
    }
    @GetMapping("/get-pd/{pd-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("pd-id") Long pdId) {
        return pdService.retrieveProjetDetail(pdId);
    }
    @PostMapping("/add-pd")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail b) {
        return pdService.addProjetDetail(b);
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-pd/{pd-id}")
    public void removeProjetDetail(@PathVariable("pd-id") Long pdId) {
        pdService.removeProjetDetail(pdId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-pd")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail b) {
        return pdService.modifyProjetDetail(b);
    }

}
