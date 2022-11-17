package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepo extends JpaRepository<Facture,Long> {
}
