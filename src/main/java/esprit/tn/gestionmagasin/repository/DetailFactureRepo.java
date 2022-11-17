package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Client;
import esprit.tn.gestionmagasin.model.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepo extends JpaRepository<DetailFacture,Long> {
}
