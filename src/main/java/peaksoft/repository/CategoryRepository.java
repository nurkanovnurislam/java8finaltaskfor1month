package peaksoft.repository;

import peaksoft.model.Category;
import peaksoft.model.Product;

import java.util.List;
import java.util.Map;

public interface CategoryRepository {
    void save (Category category);
    Map<Category,List<Product>> getAllProductGroupByCategoryName(String name);
    void deleteById(Long categoryId);
}
