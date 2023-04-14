package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skii.entity.Skieur;
import tn.esprit.skii.service.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/Skieur")
@Tag(name="Web Services - Skieur")
public class SkieurRestController {
    @Autowired
    ISkieurService SkieurService;

    // http://localhost:8089/ski/Skieur/retrieve-all-Skieurs
    @GetMapping("/retrieve-all-Skieurs")
    @Operation(description = "wiem tjib tous les Skieurs")
    public List<Skieur> getSkieurs() {
        List<Skieur> listSkieurs = SkieurService.retrieveAllSkieurs();
        return listSkieurs;
    }
    @GetMapping("/p")
    public String getP() {

        return "hhh";
    }

    // http://localhost:8089/SpringMVC/Skieur/retrieve-Skieur/8
    @GetMapping("/retrieve-Skieur/{Skieur-id}")
    @Operation(description = "wiem tjib  un Skieur")

    public Skieur retrieveSkieur(@PathVariable("Skieur-id") Integer proejtId) {
        Skieur Skieur = SkieurService.retrieveSkieur(proejtId);
        return Skieur;
    }

    // http://localhost:8089/SpringMVC/Skieur/add-Skieur
    @PostMapping("/add-Skieur")
    @Operation(description = "wiem tsajel un Skieur")

    public Skieur addSkieur(@RequestBody Skieur p) {
        Skieur Skieur = SkieurService.addSkieur(p);
        return Skieur;
    }

    // http://localhost:8089/SpringMVC/Skieur/remove-Skieur/{Skieur-id}
    @DeleteMapping("/remove-Skieur/{Skieur-id}")
    @Operation(description = "wiem tfassekh un Skieur")

    public void removeSkieur(@PathVariable("Skieur-id") Integer proejtId) {
        SkieurService.removeSkieur(proejtId);
    }

    // http://localhost:8089/SpringMVC/Skieur/modify-Skieur
    @PutMapping("/modify-Skieur")
    @Operation(description = "wiem tbadel un  Skieur")
    public Skieur modifySkieur(@RequestBody Skieur p) {
        Skieur Skieur = SkieurService.modifySkieur(p);
        return Skieur;
    }

    //http://localhost:8089/kaddem/projet/affecter-projet-detail-a-projet/1/1
    @PutMapping("/affecter-abonnement-to-skieur/{skieur-id}/{abonnement-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("skieur-id") Integer proejtId,
                                             @PathVariable("abonnement-id") Long proejtDetailsId) {
        SkieurService.addAbonnementToSkieur(proejtId, proejtDetailsId);
    }

    @PutMapping("/desaffecter-abonnement-to-skieur/{skieur-id}")
    public Skieur DesaffecterAbonfromSki(@PathVariable("skieur-id") Integer proejtId) {
        return    SkieurService.removeAbonnementFromSkieur(proejtId);
    }

    @PostMapping ("/affecter-abonnement-to-skieur/{abonnement-id}")
    public Skieur affecgterProjetAProjetDetail(@RequestBody Skieur skieur,
                                             @PathVariable("abonnement-id") Long
                                                     proejtDetailsId) {
        return  SkieurService.addAbonnementToSkieur(skieur,proejtDetailsId);
    }



}