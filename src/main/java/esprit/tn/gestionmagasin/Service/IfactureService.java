package esprit.tn.gestionmagasin.Service;


import esprit.tn.gestionmagasin.model.Facture;

import java.util.List;

public interface IfactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}
