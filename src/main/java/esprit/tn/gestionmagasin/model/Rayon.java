package esprit.tn.gestionmagasin.model;

import lombok.Data;


import javax.persistence.*;
import java.util.Set;

@Entity

@Data
public class Rayon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;
    private String codeRayon;
    private String libelleRayon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
    private Set<Produit> Produits;

}
