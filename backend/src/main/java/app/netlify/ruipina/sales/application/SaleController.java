package app.netlify.ruipina.sales.application;


import app.netlify.ruipina.sales.domain.Sale;
import app.netlify.ruipina.sales.services.SaleService;
import app.netlify.ruipina.sales.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService = new SaleService();
    @Autowired
    private SmsService smsService = new SmsService();

    @GetMapping
    public Page<Sale> findSales(@RequestParam(name = "minDate", defaultValue = ("")) String minDate,
                                @RequestParam(name = "maxDate", defaultValue = ("")) String maxDate,
                                Pageable pageable) {


        return saleService.fetchAllSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }
}
