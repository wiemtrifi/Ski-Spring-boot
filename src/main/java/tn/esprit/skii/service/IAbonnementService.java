package tn.esprit.skii.service;


import tn.esprit.skii.entity.Abonnement;

import java.util.List;

public interface IAbonnementService {
    public List<Abonnement> retrieveAllAbonnements();
    public Abonnement retrieveAbonnement(Long AbonnementId);



    public Abonnement addAbonnement(Abonnement p);
    public void removeAbonnement(Long AbonnementId);



    public Abonnement modifyAbonnement(Abonnement Abonnement);
}
