package peaksoft.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfiguration;
import peaksoft.model.Company;
import peaksoft.model.Product;
import peaksoft.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final EntityManagerFactory entityManagerFactory = HibernateConfiguration.getEntityManager();

    @Override
    public void save(Product product) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public List<Product> findAllProductsByCompanyId(Long companyId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Company company = manager.find(Company.class, companyId);
        manager.getTransaction().commit();
        manager.close();
        return company.getProducts();
    }

    @Override
    public void delete(Long productId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Product product = manager.find(Product.class,productId);
        manager.remove(product);
        manager.getTransaction().commit();
        manager.close();
    }
}
