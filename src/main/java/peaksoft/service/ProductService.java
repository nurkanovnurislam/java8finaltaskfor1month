package peaksoft.service;

import peaksoft.model.Product;

import java.util.List;

public interface ProductService {
    void save (Product product);
    List<Product> findAllProductsByCompanyId(Long companyId);
    void delete (Long productId);
}
