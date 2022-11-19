package esprit.tn.gestionmagasin.Controller;

import esprit.tn.gestionmagasin.Service.IfactureService;
import esprit.tn.gestionmagasin.model.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class FactureController {
    @Autowired
    IfactureService ifs;
    @GetMapping
    List<Facture> retrieveAllFactures() {
        return this.ifs.retrieveAllFactures();
    }
}
