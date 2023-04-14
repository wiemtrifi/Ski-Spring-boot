package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.skii.entity.Cours;
import tn.esprit.skii.repository.CoursRepository;

import java.util.List;

@Service
public class CoursService implements  ICoursService {

    @Autowired
    tn.esprit.skii.repository.CoursRepository CoursRepository;


    @Override
    public List<Cours> retrieveAllCourss() {
        return CoursRepository.findAll();
    }

    @Override
    public Cours retrieveCours(Long CoursId) {
        return CoursRepository.findById(CoursId).get();
    }

    @Override
    public Cours addCours(Cours p) {
        return CoursRepository.save(p);
    }

    @Override
    public void removeCours(Long CoursId) {
        CoursRepository.deleteById(CoursId);
    }

    @Override
    public Cours modifyCours(Cours Cours) {
        return CoursRepository.save(Cours);
    }
}
