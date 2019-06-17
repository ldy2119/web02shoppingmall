package Controller;

import Domain.Category;
import Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/category")
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @DeleteMapping("/api/category/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return categoryService.deleteById(id);
    }

    @PostMapping("/api/category/add")
    public Long add(@RequestBody Category category) {
        return categoryService.add(category);
    }

    @PutMapping("/api/category/modify")
    public int modify(@RequestBody Category category) {
        return categoryService.modify(category);
    }

    @GetMapping("/api/category/find/{id}")
    public Category findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }
}
