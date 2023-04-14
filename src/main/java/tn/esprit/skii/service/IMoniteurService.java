package tn.esprit.skii.service;


import tn.esprit.skii.entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    public List<Moniteur> retrieveAllMoniteurs();
    public Moniteur retrieveMoniteur(Long MoniteurId);
    public Moniteur addMoniteur(Moniteur p);
    public void removeMoniteur(Long MoniteurId);
    public Moniteur modifyMoniteur(Moniteur Moniteur);
}
