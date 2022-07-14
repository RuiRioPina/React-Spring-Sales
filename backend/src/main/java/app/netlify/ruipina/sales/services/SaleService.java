package app.netlify.ruipina.sales.services;

import app.netlify.ruipina.sales.domain.Sale;
import app.netlify.ruipina.sales.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> fetchAllSales() {
        return saleRepository.findAll();
    }
}
