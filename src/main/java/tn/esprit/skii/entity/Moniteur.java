package tn.esprit.skii.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idMoniteur")
    private Integer idMoniteur; // Clé primaire
    private Integer numMoniteur;
    @Temporal(TemporalType.DATE)
    private Date DateRecru;

    private String nomM;
    private String prenomM;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;




}
