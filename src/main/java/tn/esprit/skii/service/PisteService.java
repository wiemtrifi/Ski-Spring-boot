package tn.esprit.skii.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.skii.entity.Piste;
import tn.esprit.skii.repository.PisteRepository;

import java.util.List;

public interface PisteService {
    @Service
    public class PisteServiceImpl implements IPisteService {

        @Autowired
        PisteRepository pisteRepository;
        public List<Piste> retrieveAllPistes() {
            return pisteRepository.findAll();
        }
        public Piste retrievePiste(Long pisteId) {
            return pisteRepository.findById(pisteId).get();
        }
        public Piste addPiste(Piste p) {
            return pisteRepository.save(p);
        }
        public void removePiste(Long pisteId) {
            pisteRepository.deleteById(pisteId);
        }
        public Piste modifyPiste(Piste piste) {
            return pisteRepository.save(piste);
        }

    }
}
