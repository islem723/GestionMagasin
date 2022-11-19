package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.CategorieClient;
import esprit.tn.gestionmagasin.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Clientrepo extends JpaRepository<Client,Long> {
    List<Client> getClientsByCategorieClient(CategorieClient categorieClient);
}
