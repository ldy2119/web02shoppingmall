package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Product;
import kr.hs.dgsw.web02shoppingmall.Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    @Override
    public Long add(Product product) {
        return productMapper.add(product);
    }

    @Override
    public int modify(Product product) {
        return productMapper.modify(product);
    }

    @Override
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public  List<Product> findByCategoryId(Long categoryId) {
        return productMapper.findByCategoryId(categoryId);
    }

    @Override
    public List<Product> findByCategoryIdOrderByCurrentDate(Long subcategoryId) {
        return productMapper.findByCategoryIdOrderByCurrentDate(subcategoryId);
    }

    @Override
    public List<Product> findByContainName(String searchName) {
        return productMapper.findByContainName(searchName);
    }
}
