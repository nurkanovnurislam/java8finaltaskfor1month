package peaksoft.repository;

import peaksoft.model.Category;
import peaksoft.model.Company;

public interface CompanyRepository {
    void save(Company company);
    void deleteById(Long companyId);
    void update(Long companyId, Company company);
}
