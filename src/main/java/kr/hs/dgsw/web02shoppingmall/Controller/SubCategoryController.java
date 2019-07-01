package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Category;
import kr.hs.dgsw.web02shoppingmall.Domain.SubCategory;
import kr.hs.dgsw.web02shoppingmall.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @GetMapping(value = "/api/subCategory")
    public List<SubCategory> findAll() {
        return subCategoryService.findAll();
    }

    @DeleteMapping(value = "/api/subCategory/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return subCategoryService.deleteById(id);
    }

    @PostMapping(value = "/api/subCategory/add")
    public Long add(@RequestBody SubCategory subcategory) {
        return subCategoryService.add(subcategory);
    }

    @PutMapping(value = "/api/subCategory/modify")
    public int modify(@RequestBody SubCategory subcategory) {
        return subCategoryService.modify(subcategory);
    }

    @GetMapping(value = "/api/subCategory/find/{id}")
    public SubCategory findById(@PathVariable Long id) {
        return subCategoryService.findById(id);
    }

    @GetMapping(value = "/api/subCategory/findByCategoryId/{categoryId}")
    public List<SubCategory> findByCategoryId(@PathVariable Long categoryId) {
        return subCategoryService.findByCategoryId(categoryId);
    }
}
