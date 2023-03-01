package tn.esprit.skii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Cours;
@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {


}
