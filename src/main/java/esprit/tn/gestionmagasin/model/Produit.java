package esprit.tn.gestionmagasin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToOne(cascade = CascadeType.ALL)
    Fournisseur fournisseur;
    @ManyToOne
    Rayon rayon;
    @ManyToOne
    Stock stock;

    @OneToOne
    private DetailProduit detailProduit;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurs;
}
