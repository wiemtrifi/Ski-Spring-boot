package tn.esprit.skii.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.skii.entity.Cours;
import tn.esprit.skii.service.ICoursService;

import java.util.List;

@RestController
@RequestMapping("/Cours")
@Tag(name="Web Services - Cours")
public class CoursRestController {
    @Autowired
    ICoursService CoursService;

    // http://localhost:8089/ski/Cours/retrieve-all-Courss
    @GetMapping("/retrieve-all-Courss")
    @Operation(description = "wiem tjib tous les Courss")
    public List<Cours> getCourss() {
        List<Cours> listCourss = CoursService.retrieveAllCourss();
        return listCourss;
    }
    @GetMapping("/p")
    public String getP() {

        return "hhh";
    }

    // http://localhost:8089/SpringMVC/Cours/retrieve-Cours/8
    @GetMapping("/retrieve-Cours/{Cours-id}")
    @Operation(description = "wiem tjib  un Cours")

    public Cours retrieveCours(@PathVariable("Cours-id") Long proejtId) {
        Cours Cours = CoursService.retrieveCours(proejtId);
        return Cours;
    }

    // http://localhost:8089/SpringMVC/Cours/add-Cours
    @PostMapping("/add-Cours")
    @Operation(description = "wiem tsajel un Cours")

    public Cours addCours(@RequestBody Cours p) {
        Cours Cours = CoursService.addCours(p);
        return Cours;
    }

    // http://localhost:8089/SpringMVC/Cours/remove-Cours/{Cours-id}
    @DeleteMapping("/remove-Cours/{Cours-id}")
    @Operation(description = "wiem tfassekh un Cours")

    public void removeCours(@PathVariable("Cours-id") Long proejtId) {
        CoursService.removeCours(proejtId);
    }

    // http://localhost:8089/SpringMVC/Cours/modify-Cours
    @PutMapping("/modify-Cours")
    @Operation(description = "wiem tbadel un  Cours")
    public Cours modifyCours(@RequestBody Cours p) {
        Cours Cours = CoursService.modifyCours(p);
        return Cours;
    }

}