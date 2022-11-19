package esprit.tn.gestionmagasin.model;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity

@Data
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Boolean  active;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> facturee;

    }

