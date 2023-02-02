package peaksoft.repository;

import peaksoft.model.Product;

import java.util.List;

public interface ProductRepository {
    void save (Product product);
    List<Product> findAllProductsByCompanyId(Long companyId);
    void delete (Long productId);
}
