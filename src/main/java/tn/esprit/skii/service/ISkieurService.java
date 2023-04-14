package tn.esprit.skii.service;


import tn.esprit.skii.entity.Skieur;

import java.util.List;

public interface ISkieurService {
    public List<Skieur> retrieveAllSkieurs();
    public Skieur retrieveSkieur(Integer SkieurId);
    public Skieur addSkieur(Skieur p);
    public void removeSkieur(Integer SkieurId);
    public Skieur modifySkieur(Skieur Skieur);

    public void addAbonnementToSkieur(Integer idSkieur , Long idAbonnement);
    public Skieur addAbonnementToSkieur(Skieur skieur , Long idAbonnement);
    public Skieur removeAbonnementFromSkieur(Integer idSkieur);

}
