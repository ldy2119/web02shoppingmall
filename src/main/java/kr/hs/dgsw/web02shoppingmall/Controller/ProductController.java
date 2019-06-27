package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Product;
import kr.hs.dgsw.web02shoppingmall.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/api/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping(value = "/api/product/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return productService.deleteById(id);
    }

    @PostMapping(value = "/api/product/add")
    public Long add(@RequestBody Product product) {
        return productService.add(product);
    }

    @PutMapping(value = "/api/product/modify")
    public int modify(@RequestBody Product product) {
        return productService.modify(product);
    }

    @GetMapping(value = "/api/product/find/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/api/product/findByCategory/{categoryId}")
    public List<Product> findByCategoryId(@PathVariable Long categoryId) {
        return productService.findByCategoryId(categoryId);
    }

    @GetMapping(value = "/api/product/findByCurrentDate/{categoryId}")
    public List<Product> findByCurrentDate(@PathVariable Long categoryId) {
        return productService.findByCategoryIdOrderByCurrentDate(categoryId);
    }
}
