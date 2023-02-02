package peaksoft.service;

import peaksoft.model.Category;
import peaksoft.model.Product;

import java.util.List;
import java.util.Map;

public interface CategoryService {
    void save (Category category);
    Map<Category,List<Product>> getAllProductGroupByCategoryName(String name);
}
