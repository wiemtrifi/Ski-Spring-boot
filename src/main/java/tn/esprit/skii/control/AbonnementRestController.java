package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skii.entity.Abonnement;
import tn.esprit.skii.service.IAbonnementService;


import java.util.List;

@RestController
@RequestMapping("/Abonnement")
@Tag(name="Web Services - Abonnement")
public class AbonnementRestController {
    @Autowired
    IAbonnementService AbonnementService;

    // http://localhost:8089/ski/Abonnement/retrieve-all-Abonnements
    @GetMapping("/retrieve-all-Abonnements")
    @Operation(description = "wiem tjib tous les Abonnements")
    public List<Abonnement> getAbonnements() {
        List<Abonnement> listAbonnements = AbonnementService.retrieveAllAbonnements();
        return listAbonnements;
    }
    @GetMapping("/p")
    public String getP() {

        return "hhh";
    }

    // http://localhost:8089/SpringMVC/Abonnement/retrieve-Abonnement/8
    @GetMapping("/retrieve-Abonnement/{Abonnement-id}")
    @Operation(description = "wiem tjib  un Abonnement")

    public Abonnement retrieveAbonnement(@PathVariable("Abonnement-id") Long proejtId) {
        Abonnement Abonnement = AbonnementService.retrieveAbonnement(proejtId);
        return Abonnement;
    }

    // http://localhost:8089/SpringMVC/Abonnement/add-Abonnement
    @PostMapping("/add-Abonnement")
    @Operation(description = "wiem tsajel un Abonnement")

    public Abonnement addAbonnement(@RequestBody Abonnement p) {
        Abonnement Abonnement = AbonnementService.addAbonnement(p);
        return Abonnement;
    }

    // http://localhost:8089/SpringMVC/Abonnement/remove-Abonnement/{Abonnement-id}
    @DeleteMapping("/remove-Abonnement/{Abonnement-id}")
    @Operation(description = "wiem tfassekh un Abonnement")

    public void removeAbonnement(@PathVariable("Abonnement-id") Long proejtId) {
        AbonnementService.removeAbonnement(proejtId);
    }

    // http://localhost:8089/SpringMVC/Abonnement/modify-Abonnement
    @PutMapping("/modify-Abonnement")
    @Operation(description = "wiem tbadel un  Abonnement")
    public Abonnement modifyAbonnement(@RequestBody Abonnement p) {
        Abonnement Abonnement = AbonnementService.modifyAbonnement(p);
        return Abonnement;
    }

}