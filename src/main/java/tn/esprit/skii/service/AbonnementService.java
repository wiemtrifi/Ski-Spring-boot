package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.skii.entity.Abonnement;


import java.util.List;

@Service
public class AbonnementService implements  IAbonnementService {

    @Autowired
    tn.esprit.skii.repository.AbonnementRepository AbonnementRepository;


    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return AbonnementRepository.findAll();
    }




    @Override
    public Abonnement retrieveAbonnement(Long AbonnementId) {
        return AbonnementRepository.findById(AbonnementId).get();
    }


    @Override
    public Abonnement addAbonnement(Abonnement p) {
        return AbonnementRepository.save(p);
    }



    @Override
    public void removeAbonnement(Long AbonnementId) {
        AbonnementRepository.deleteById(AbonnementId);
    }

    @Override
    public Abonnement modifyAbonnement(Abonnement Abonnement) {
        return AbonnementRepository.save(Abonnement);
    }
}
