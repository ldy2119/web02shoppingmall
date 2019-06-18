package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    int deleteById(Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(Long id);
    Product findByCategoryId(Long categoryId);
}
