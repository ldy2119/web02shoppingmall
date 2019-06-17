package Service;

import Domain.Product;
import Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public Product findByCategoryId(Long categoryId) {
        return productMapper.findByCategoryId(categoryId);
    }
}
