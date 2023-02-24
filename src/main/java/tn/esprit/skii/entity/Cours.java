package tn.esprit.skii.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Cours")
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCours")
    private Integer idCours; // Clé primaire
    private Integer numCours;
    private Integer niveau;
    private float prix;
    private Integer creneau;

    @Enumerated(EnumType.STRING)
    private Support  support;
    private TypeCours typeCours;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> inscriptions;
}
