package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepo extends JpaRepository<Facture,Long> {
    List<Facture> getFactureByClientIdClient(long client_idClient);
}
