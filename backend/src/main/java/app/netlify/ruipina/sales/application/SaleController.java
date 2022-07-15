package app.netlify.ruipina.sales.application;


import app.netlify.ruipina.sales.domain.Sale;
import app.netlify.ruipina.sales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService = new SaleService();
    @GetMapping
    public Page<Sale> findSales(@RequestParam(name="minDate", defaultValue = ("")) String minDate,
                                @RequestParam(name="maxDate", defaultValue = ("")) String maxDate,
                                Pageable pageable) {


        return saleService.fetchAllSales(minDate, maxDate, pageable);
    }
}
