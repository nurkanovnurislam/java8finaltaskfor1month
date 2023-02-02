package peaksoft.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import peaksoft.config.HibernateConfiguration;
import peaksoft.model.Category;
import peaksoft.model.Product;
import peaksoft.repository.CategoryRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategoryRepositoryImpl implements CategoryRepository {
       private final EntityManagerFactory entityManagerFactory = HibernateConfiguration.getEntityManager();
    @Override
    public void save(Category category) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(category);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public Map<Category,List<Product>> getAllProductGroupByCategoryName(String name) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        List<Product> products = manager.createQuery("select c from Product c", Product.class).getResultList();
        Map<Category, List<Product>> map = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        manager.getTransaction().commit();
        manager.close();
        return map;
    }

    @Override
    public void deleteById(Long categoryId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Category category = manager.find(Category.class, categoryId);
        manager.remove(category);
        manager.getTransaction().commit();
        manager.close();
    }
}
