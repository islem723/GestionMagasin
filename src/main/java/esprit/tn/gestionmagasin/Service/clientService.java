package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.CategorieClient;
import esprit.tn.gestionmagasin.model.Client;
import esprit.tn.gestionmagasin.model.Facture;
import esprit.tn.gestionmagasin.repository.Clientrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class clientService implements IclientService{
    @Autowired
    Clientrepo ctr;
    @Override
    public List<Client> retrieveAllClients() {
        return ctr.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return ctr.save(c);
    }

    @Override
    public void deleteClient(Long id) {
            ctr.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return ctr.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return ctr.findById(id).orElse(null);
    }

    @Override
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
        List<Client> clients = ctr.getClientsByCategorieClient(categorieClient);
        float s = 0;
        for(Client c : clients)
            s += sommeFactureParDate(c,startDate, endDate);
        return s;
    }
    private float sommeFactureParDate(Client c, Date dateDebut, Date dateFin){
        float s = (float) c.getFactures().stream()
                .filter(facture ->  facture.getActive() == false &&
                        facture.getDateFacture().after(dateDebut)  &&
                        facture.getDateFacture().before(dateDebut))
                .collect(Collectors.summarizingDouble(Facture::getMontantFacture))
                .getSum();
        return s;
    }
    }

