package tn.esprit.skii.service;

import tn.esprit.skii.entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    public List<Inscription> retrieveAllInscriptions();
    public Inscription retrieveInscription(Long InscriptionId);
    public Inscription addInscription(Inscription p);
    public void removeInscription(Long InscriptionId);
    public Inscription modifyInscription(Inscription Inscription);
}
