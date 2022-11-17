package esprit.tn.gestionmagasin.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity

@Data
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idDetailProduit;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;

    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;
    @OneToOne(mappedBy="detailProduit")
    private Produit produit;

}
