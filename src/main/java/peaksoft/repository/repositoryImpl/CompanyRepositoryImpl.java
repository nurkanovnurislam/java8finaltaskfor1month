package peaksoft.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfiguration;
import peaksoft.model.Category;
import peaksoft.model.Company;
import peaksoft.repository.CompanyRepository;

public class CompanyRepositoryImpl implements CompanyRepository {
    private final EntityManagerFactory entityManagerFactory = HibernateConfiguration.getEntityManager();

    @Override
    public void save(Company company) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(company);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void deleteById(Long companyId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Company company = manager.find(Company.class,companyId);
        manager.remove(company);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void update(Long companyId, Company company) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        Company company1 = manager.find(Company.class,companyId);
        company1.setCompanyName(company.getCompanyName());
        manager.merge(company1);
        manager.getTransaction().commit();
        manager.close();
    }
}
