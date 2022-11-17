package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.DetailProduit;
import esprit.tn.gestionmagasin.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<Stock,Long> {
}
