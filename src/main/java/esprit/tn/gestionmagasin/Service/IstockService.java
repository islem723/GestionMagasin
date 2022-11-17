package esprit.tn.gestionmagasin.Service;

import esprit.tn.gestionmagasin.model.Stock;

import java.util.List;

public interface IstockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
    void assignProduitToStock(Long idProduit, Long idStock);
}
