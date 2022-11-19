package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.CategorieClient;
import esprit.tn.gestionmagasin.model.Client;
import esprit.tn.gestionmagasin.model.Facture;
import esprit.tn.gestionmagasin.repository.Clientrepo;
import esprit.tn.gestionmagasin.repository.FactureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class factureService implements IfactureService {
    @Autowired
    FactureRepo ftr;
@Autowired
 Clientrepo clr;
    @Override
    public List<Facture> retrieveAllFactures() {
        return null;
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return null;
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {

        return ftr.getFactureByClientIdClient(idClient);

    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client cc = clr.findById(idClient).orElse(null);

      if(cc!=null)
       f.setClient(cc);
        return null;
    }


    }

