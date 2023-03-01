package tn.esprit.skii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}

