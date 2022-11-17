package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Produit;
import esprit.tn.gestionmagasin.model.Stock;
import esprit.tn.gestionmagasin.repository.StockRepo;
import esprit.tn.gestionmagasin.repository.produitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockService implements IstockService{
@Autowired
    StockRepo str;
@Autowired
produitRepo pr;
    @Override
    public List<Stock> retrieveAllStocks() {
        return str.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return str.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return str.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return str.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p= pr.findById(idProduit).orElse(null);
        Stock s= str.findById(idStock).orElse(null);
        p.setStock(s);
        pr.save(p);

    }
}
