package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Fournisseur;
import esprit.tn.gestionmagasin.model.Produit;
import esprit.tn.gestionmagasin.model.Stock;
import esprit.tn.gestionmagasin.repository.FournisseurRepo;
import esprit.tn.gestionmagasin.repository.produitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class produitService implements iproduitService{
    @Autowired
    produitRepo pr;
    @Autowired
    FournisseurRepo frp;
    @Override
    public List<Produit> retrieveAllProduits() {
        return pr.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return null;
    }

    @Override
    public void assignFournissuerToProduit(Long fournisseurId, Long produitId) {
        Fournisseur f= frp.findById(fournisseurId).orElse(null);
        Produit p= pr.findById(produitId).orElse(null);
        p.getFournisseurs().add(f);
        pr.save(p);
    }
}
