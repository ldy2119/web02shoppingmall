package Controller;

import Domain.Product;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/api/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping("/api/product/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return productService.deleteById(id);
    }

    @PostMapping("/api/product/add")
    public Long add(@RequestBody Product product) {
        return productService.add(product);
    }

    @PutMapping("/api/product/modify")
    public int modify(@RequestBody Product product) {
        return productService.modify(product);
    }

    @GetMapping("/api/product/find/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/api/product/findByCategory/{id}")
    public Product findByCategoryId(@PathVariable Long categoryId) {
        return productService.findByCategoryId(categoryId);
    }
}
