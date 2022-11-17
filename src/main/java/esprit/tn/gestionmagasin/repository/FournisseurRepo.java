package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepo extends JpaRepository<Fournisseur,Long> {
}
