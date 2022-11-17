package esprit.tn.gestionmagasin.model;

import lombok.Data;

import javax.persistence.*;

@Entity

@Data
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qte;
    private float prixTotal;
    private Integer pourcentageRemise ;
    private Integer montantRemise;
    @ManyToOne
    Facture facture;

}
