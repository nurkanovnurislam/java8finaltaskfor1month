package peaksoft.service.serviceImpl;

import peaksoft.model.Product;
import peaksoft.repository.repositoryImpl.ProductRepositoryImpl;
import peaksoft.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findAllProductsByCompanyId(Long companyId) {
        return productRepository.findAllProductsByCompanyId(companyId);
    }

    @Override
    public void delete(Long productId) {
        productRepository.delete(productId);
    }
}
