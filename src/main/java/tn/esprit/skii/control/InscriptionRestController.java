package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skii.entity.Inscription;
import tn.esprit.skii.service.IInscriptionService;


import java.util.List;

@RestController
@RequestMapping("/Inscription")
@Tag(name="Web Services - Inscription")
public class InscriptionRestController {
    @Autowired
    IInscriptionService InscriptionService;

    // http://localhost:8089/ski/Inscription/retrieve-all-Inscriptions
    @GetMapping("/retrieve-all-Inscriptions")
    @Operation(description = "wiem tjib tous les Inscriptions")
    public List<Inscription> getInscriptions() {
        List<Inscription> listInscriptions = InscriptionService.retrieveAllInscriptions();
        return listInscriptions;
    }
    @GetMapping("/p")
    public String getP() {

        return "hhh";
    }

    // http://localhost:8089/SpringMVC/Inscription/retrieve-Inscription/8
    @GetMapping("/retrieve-Inscription/{Inscription-id}")
    @Operation(description = "wiem tjib  un Inscription")

    public Inscription retrieveInscription(@PathVariable("Inscription-id") Long proejtId) {
        Inscription Inscription = InscriptionService.retrieveInscription(proejtId);
        return Inscription;
    }

    // http://localhost:8089/SpringMVC/Inscription/add-Inscription
    @PostMapping("/add-Inscription")
    @Operation(description = "wiem tsajel un Inscription")

    public Inscription addInscription(@RequestBody Inscription p) {
        Inscription Inscription = InscriptionService.addInscription(p);
        return Inscription;
    }

    // http://localhost:8089/SpringMVC/Inscription/remove-Inscription/{Inscription-id}
    @DeleteMapping("/remove-Inscription/{Inscription-id}")
    @Operation(description = "wiem tfassekh un Inscription")

    public void removeInscription(@PathVariable("Inscription-id") Long proejtId) {
        InscriptionService.removeInscription(proejtId);
    }

    // http://localhost:8089/SpringMVC/Inscription/modify-Inscription
    @PutMapping("/modify-Inscription")
    @Operation(description = "wiem tbadel un  Inscription")
    public Inscription modifyInscription(@RequestBody Inscription p) {
        Inscription Inscription = InscriptionService.modifyInscription(p);
        return Inscription;
    }

}