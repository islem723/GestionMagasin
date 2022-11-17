package esprit.tn.gestionmagasin.repository;

import esprit.tn.gestionmagasin.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Clientrepo extends JpaRepository<Client,Long> {
}
