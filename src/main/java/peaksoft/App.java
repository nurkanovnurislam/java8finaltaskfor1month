package peaksoft;

import peaksoft.model.Category;
import peaksoft.model.Company;
import peaksoft.service.serviceImpl.CompanyServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        HibernateConfiguration.getEntityManager();
        System.out.println( "Hello World!" );
        CompanyServiceImpl companyService = new CompanyServiceImpl();
        Company company = new Company("Nursoft","KGZ");

//        companyService.save(company);
//        companyService.deleteById(2L);
//        companyService.update(1L,company);
        ////


    }
}
