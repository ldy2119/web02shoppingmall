package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Category;
import kr.hs.dgsw.web02shoppingmall.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/api/category")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping(value = "/api/category/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return categoryService.deleteById(id);
    }

    @PostMapping(value = "/api/category/add")
    public Long add(@RequestBody Category category) {
        return categoryService.add(category);
    }

    @PutMapping(value = "/api/category/modify")
    public int modify(@RequestBody Category category) {
        return categoryService.modify(category);
    }

    @GetMapping(value = "/api/category/find/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }
}
