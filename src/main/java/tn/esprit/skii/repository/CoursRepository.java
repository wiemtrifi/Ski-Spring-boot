package tn.esprit.skii.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Cours;
import tn.esprit.skii.entity.TypeCours;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {


    List<Cours> findAllByTypeCoursAndPrixLessThanEqual(TypeCours t, float p);
}
