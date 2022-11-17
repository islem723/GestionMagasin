package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepo extends JpaRepository<DetailProduit,Long> {
}
