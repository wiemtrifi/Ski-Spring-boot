package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.skii.entity.Abonnement;
import tn.esprit.skii.entity.Skieur;
import tn.esprit.skii.repository.SkieurRepository;

import java.util.List;

@Service
public class SkieurService implements  ISkieurService {

    @Autowired
    tn.esprit.skii.repository.SkieurRepository SkieurRepository;

    @Autowired
    IAbonnementService abonnementService;


    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return SkieurRepository.findAll();
    }

    @Override
    public Skieur retrieveSkieur(Integer SkieurId) {
        return SkieurRepository.findById(SkieurId).get();
    }

    @Override
    public Skieur addSkieur(Skieur p) {
        return SkieurRepository.save(p);
    }

    @Override
    public void removeSkieur(Integer SkieurId) {
        SkieurRepository.deleteById(SkieurId);
    }

    @Override
    public Skieur modifySkieur(Skieur Skieur) {
        return SkieurRepository.save(Skieur);
    }

    @Override
    public void addAbonnementToSkieur(Integer idSkieur , Long idAbonnement) {
        Skieur skieur = retrieveSkieur(idSkieur);
        Abonnement abonnement = abonnementService.retrieveAbonnement(idAbonnement);
// on set le fils dans le parent :
        skieur.setAbonnements(abonnement);
        modifySkieur(skieur);
    }

    @Override
    public Skieur addAbonnementToSkieur(Skieur skieur, Long idAbonnement) {
        Abonnement abon = abonnementService.retrieveAbonnement(idAbonnement);
        skieur.setAbonnements(abon);
        return addSkieur(skieur);

    }

    @Override
    public Skieur removeAbonnementFromSkieur(Integer idSkieur) {

            Skieur skieur = retrieveSkieur((idSkieur));
            skieur.setAbonnements(null);
            return  modifySkieur(skieur);

    }


}
