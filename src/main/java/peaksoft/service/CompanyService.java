package peaksoft.service;

import peaksoft.model.Company;

public interface CompanyService {
    void save(Company company);
    void deleteById(Long companyId);
    void update(Long companyId, Company company);
}
