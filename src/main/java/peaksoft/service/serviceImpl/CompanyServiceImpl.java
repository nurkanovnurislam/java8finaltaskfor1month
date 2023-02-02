package peaksoft.service.serviceImpl;

import peaksoft.model.Category;
import peaksoft.model.Company;
import peaksoft.repository.repositoryImpl.CompanyRepositoryImpl;
import peaksoft.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    private CompanyRepositoryImpl categoryRepository = new CompanyRepositoryImpl();

    @Override
    public void save(Company company) {
        categoryRepository.save(company);
    }

    @Override
    public void deleteById(Long companyId) {
        categoryRepository.deleteById(companyId);
    }

    @Override
    public void update(Long companyId, Company company) {
        categoryRepository.update(companyId, company);
    }
}
