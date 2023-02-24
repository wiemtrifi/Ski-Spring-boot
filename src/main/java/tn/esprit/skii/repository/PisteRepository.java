package tn.esprit.skii.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Piste;
@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
