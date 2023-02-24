package tn.esprit.skii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
}

