package esprit.tn.gestionmagasin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity

@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qteStock;
    private  Integer qteMin;
    private String libelleStock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
    private Set<Produit> Produits;
}
