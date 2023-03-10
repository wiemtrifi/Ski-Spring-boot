package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.skii.entity.Piste;
import tn.esprit.skii.service.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/piste")
@Tag(name="web service")
public class PisteRestController {
    @Autowired
    IPisteService pisteService;

    // http://localhost:8089/skiMVC/piste/retrieve-all-pistes
    @Operation(description = "saddi yjib les pistes")
    @GetMapping("/retrieve-all-pistes")
    public List<Piste> getPistes() {
        List<Piste> listPistes = pisteService.retrieveAllPistes();
        return listPistes;
    }

    // http://localhost:8089/SkiMVC/piste/retrieve-piste/8
    @Operation(description = "saddi ysajel les pistes")
    @GetMapping("/retrieve-piste/{piste-id}")
    public Piste retrievePiste(@PathVariable("piste-id") Long proejtId) {
        Piste piste = pisteService.retrievePiste(proejtId);
        return piste;
    }
    // http://localhost:8089/SkiMVC/piste/add-piste
    @Operation(description = "saddi yzid les pistes")
    @PostMapping("/add-piste")
    public Piste addPiste(@RequestBody Piste p) {
        Piste piste = pisteService.addPiste(p);
        return piste;
    }
    // http://localhost:8089/SkiMVC/piste/remove-piste/{piste-id}
    @Operation(description = "saddi yfasakh les pistes")
    @DeleteMapping("/remove-piste/{piste-id}")
    public void removePiste(@PathVariable("piste-id") Long proejtId) {
        pisteService.removePiste(proejtId);
    }
    // http://localhost:8089/SkiMVC/piste/modify-piste
    @Operation(description = "saddi ymodifi les pistes")
    @PutMapping("/modify-piste")
    public Piste modifyPiste(@RequestBody Piste p) {
        Piste piste = pisteService.modifyPiste(p);
        return piste;
    }
}