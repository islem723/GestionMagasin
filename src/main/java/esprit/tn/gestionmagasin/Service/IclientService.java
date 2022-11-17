package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Client;

import java.util.List;

public interface IclientService {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
}
