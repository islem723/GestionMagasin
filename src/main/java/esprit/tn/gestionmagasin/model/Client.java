package esprit.tn.gestionmagasin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity

@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private  String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String password;
    private String  email ;
    private String passwordd;
    @Enumerated(EnumType.STRING)
    private CategorieClient categorieClient ;

    @Enumerated(EnumType.STRING)
    private Profession profession;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Facture> factures;


}
