package Service;

import Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    int deleteById(Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(Long id);
    Product findByCategoryId(Long categoryId);
}
