package tn.esprit.skii.service;

import tn.esprit.skii.entity.Piste;

import java.util.List;

public interface IPisteService {
    public List<Piste> retrieveAllPistes();
    public Piste retrievePiste(Long pisteId);
    public Piste addPiste(Piste p);
    public void removePiste(Long pisteId);
    public Piste modifyPiste(Piste piste);
}
