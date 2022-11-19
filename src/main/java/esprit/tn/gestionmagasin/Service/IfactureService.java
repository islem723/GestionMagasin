package esprit.tn.gestionmagasin.Service;


import esprit.tn.gestionmagasin.model.CategorieClient;
import esprit.tn.gestionmagasin.model.Facture;

import java.util.Date;
import java.util.List;

public interface IfactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture>getFacturesByClient(Long idClient);
    Facture addFacture(Facture f, Long idClient);

}
