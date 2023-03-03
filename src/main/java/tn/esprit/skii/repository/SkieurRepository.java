package tn.esprit.skii.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.skii.entity.Skieur;
import java.util.Date;
import java.util.List;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
    //tous les skieurs qui habitent a ariana et qui ont une dnasisance 2000
    List<Skieur> findAllByVilleAndDateNaissanceBefore(String v, Date d);
    //tous les skieurs qui ont abonnement expiré
    List<Skieur> findAllByAbonnements_DateFinLessThan(Date d);

   // List<Skieur> recupererSkieurAbonExpire(Date d);


   //avec param eli heya khir
    @Query("SELECT s from Skieur s WHERE s.abonnements.DateFin<= : dd")
    List<Skieur> recupererSkieurAbonExpireee(@Param("dd") Date d);


    //sans param
    @Query("SELECT s from Skieur s WHERE s.abonnements.DateFin<= ?1")
    List<Skieur> recupererSkieurAbonExpire(Date d);



}

