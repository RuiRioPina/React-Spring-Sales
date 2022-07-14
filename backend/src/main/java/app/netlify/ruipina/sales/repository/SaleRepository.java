package app.netlify.ruipina.sales.repository;

import app.netlify.ruipina.sales.domain.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    public void fetchSalesBetweenDate();
}
