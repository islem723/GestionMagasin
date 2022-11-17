package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepo extends JpaRepository<Produit,Long> {
}
