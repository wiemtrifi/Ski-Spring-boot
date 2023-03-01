package tn.esprit.skii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}

