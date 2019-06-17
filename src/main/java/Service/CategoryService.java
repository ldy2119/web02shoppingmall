package Service;

import Domain.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();
    int deleteById(Long id);
    Long add(Category category);
    int modify(Category category);
    Category findById(Long id);
}
