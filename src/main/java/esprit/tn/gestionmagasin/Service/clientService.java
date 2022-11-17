package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Client;
import esprit.tn.gestionmagasin.repository.Clientrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
