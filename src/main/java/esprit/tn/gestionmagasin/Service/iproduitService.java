package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Produit;

import java.util.List;

public interface iproduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    public void assignFournissuerToProduit(Long fournisseurId,Long produitId);
}
