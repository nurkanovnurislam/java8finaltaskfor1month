package peaksoft.service.serviceImpl;

import peaksoft.model.Category;
import peaksoft.model.Product;
import peaksoft.repository.repositoryImpl.CategoryRepositoryImpl;
import peaksoft.service.CategoryService;

import java.util.List;
import java.util.Map;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepositoryImpl categoryRepository = new CategoryRepositoryImpl();

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Map<Category,List<Product>> getAllProductGroupByCategoryName(String name) {
        return categoryRepository.getAllProductGroupByCategoryName(name);
    }
}
