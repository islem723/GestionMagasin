package esprit.tn.gestionmagasin.Controller;

import esprit.tn.gestionmagasin.Service.IstockService;
import esprit.tn.gestionmagasin.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    IstockService is;
    @PutMapping("/modify-stock")
    @ResponseBody
    public Stock updateStock(@RequestBody Stock stock) {
        return is.updateStock(stock);
    }
    @PostMapping(value = "/affect-produit-to-stock/{idProduit}/{idStock}")
    @ResponseBody
    public void assignProduitToStock(@PathVariable("idProduit")Long idProduit, @PathVariable("idStock") Long idStock){
        is.assignProduitToStock(idProduit, idStock);
    }

    @GetMapping
    List<Stock> retrieveAllStocks() {
        return this.is.retrieveAllStocks();
    }

    @PostMapping
    Stock addStock(@RequestBody Stock s) {
        return this.is.addStock(s);
    }
}
