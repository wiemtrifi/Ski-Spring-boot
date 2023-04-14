package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.skii.entity.Moniteur;
import tn.esprit.skii.repository.MoniteurRepository;


import java.util.List;

@Service
public class MoniteurService implements  IMoniteurService {

    @Autowired
    tn.esprit.skii.repository.MoniteurRepository MoniteurRepository;


    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return MoniteurRepository.findAll();
    }

    @Override
    public Moniteur retrieveMoniteur(Long MoniteurId) {
        return MoniteurRepository.findById(MoniteurId).get();
    }

    @Override
    public Moniteur addMoniteur(Moniteur p) {
        return MoniteurRepository.save(p);
    }

    @Override
    public void removeMoniteur(Long MoniteurId) {
        MoniteurRepository.deleteById(MoniteurId);
    }

    @Override
    public Moniteur modifyMoniteur(Moniteur Moniteur) {
        return MoniteurRepository.save(Moniteur);
    }
}
