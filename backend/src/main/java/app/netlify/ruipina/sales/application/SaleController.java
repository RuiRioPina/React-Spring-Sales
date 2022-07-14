package app.netlify.ruipina.sales.application;


import app.netlify.ruipina.sales.domain.Sale;
import app.netlify.ruipina.sales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService = new SaleService();
    @GetMapping
    public List<Sale> fetchAllSales() {
        return saleService.fetchAllSales();
    }
}
