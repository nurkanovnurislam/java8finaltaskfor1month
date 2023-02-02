package peaksoft.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.model.Category;
import peaksoft.model.Company;
import peaksoft.model.Product;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfiguration {
    public static EntityManagerFactory getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS,"");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Category.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Product.class);
        return configuration.buildSessionFactory();
    }
}
