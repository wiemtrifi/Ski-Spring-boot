package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.skii.entity.Inscription;
import tn.esprit.skii.repository.InscriptionRepository;


import java.util.List;

@Service
public class InscriptionService implements  IInscriptionService {

    @Autowired
    tn.esprit.skii.repository.InscriptionRepository InscriptionRepository;


    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return InscriptionRepository.findAll();
    }

    @Override
    public Inscription retrieveInscription(Long InscriptionId) {
        return InscriptionRepository.findById(InscriptionId).get();
    }

    @Override
    public Inscription addInscription(Inscription p) {
        return InscriptionRepository.save(p);
    }

    @Override
    public void removeInscription(Long InscriptionId) {
        InscriptionRepository.deleteById(InscriptionId);
    }

    @Override
    public Inscription modifyInscription(Inscription Inscription) {
        return InscriptionRepository.save(Inscription);
    }
}
