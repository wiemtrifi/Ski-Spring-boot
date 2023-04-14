package tn.esprit.skii.service;


import tn.esprit.skii.entity.Cours;

import java.util.List;

public interface ICoursService {
    public List<Cours> retrieveAllCourss();
    public Cours retrieveCours(Long CoursId);
    public Cours addCours(Cours p);
    public void removeCours(Long CoursId);
    public Cours modifyCours(Cours Cours);
}
