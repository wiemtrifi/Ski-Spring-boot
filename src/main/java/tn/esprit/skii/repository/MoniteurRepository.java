package tn.esprit.skii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}

