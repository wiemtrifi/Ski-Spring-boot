package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skii.entity.Moniteur;
import tn.esprit.skii.service.IMoniteurService;


import java.util.List;

@RestController
@RequestMapping("/Moniteur")
@Tag(name="Web Services - Moniteur")
public class MoniteurRestController {
    @Autowired
    IMoniteurService MoniteurService;

    // http://localhost:8089/ski/Moniteur/retrieve-all-Moniteurs
    @GetMapping("/retrieve-all-Moniteurs")
    @Operation(description = "wiem tjib tous les Moniteurs")
    public List<Moniteur> getMoniteurs() {
        List<Moniteur> listMoniteurs = MoniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }
    @GetMapping("/p")
    public String getP() {

        return "hhh";
    }

    // http://localhost:8089/SpringMVC/Moniteur/retrieve-Moniteur/8
    @GetMapping("/retrieve-Moniteur/{Moniteur-id}")
    @Operation(description = "wiem tjib  un Moniteur")

    public Moniteur retrieveMoniteur(@PathVariable("Moniteur-id") Long proejtId) {
        Moniteur Moniteur = MoniteurService.retrieveMoniteur(proejtId);
        return Moniteur;
    }

    // http://localhost:8089/SpringMVC/Moniteur/add-Moniteur
    @PostMapping("/add-Moniteur")
    @Operation(description = "wiem tsajel un Moniteur")

    public Moniteur addMoniteur(@RequestBody Moniteur p) {
        Moniteur Moniteur = MoniteurService.addMoniteur(p);
        return Moniteur;
    }

    // http://localhost:8089/SpringMVC/Moniteur/remove-Moniteur/{Moniteur-id}
    @DeleteMapping("/remove-Moniteur/{Moniteur-id}")
    @Operation(description = "wiem tfassekh un Moniteur")

    public void removeMoniteur(@PathVariable("Moniteur-id") Long proejtId) {
        MoniteurService.removeMoniteur(proejtId);
    }

    // http://localhost:8089/SpringMVC/Moniteur/modify-Moniteur
    @PutMapping("/modify-Moniteur")
    @Operation(description = "wiem tbadel un  Moniteur")
    public Moniteur modifyMoniteur(@RequestBody Moniteur p) {
        Moniteur Moniteur = MoniteurService.modifyMoniteur(p);
        return Moniteur;
    }

}