package tn.esprit.skii.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Piste;

import java.util.List;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
    List<Piste> findPisteByPenteIsLessThanaAndLongeurGreaterThan(Integer pente,Integer longeur);
    @Query("SELECT piste FROM Piste piste"
            + " INNER JOIN piste.skieurs skieur"
            + " INNER JOIN Inscription inscp"
            + " where inscp.cours.typeCours = 'snowboard'"
          )
    List<Piste> coursskieur(@Param("snowboard")
                                String typeCours);



}
