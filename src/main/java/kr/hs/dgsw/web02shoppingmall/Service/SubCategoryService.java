package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.SubCategory;

import java.util.List;

public interface SubCategoryService {
    List<SubCategory> findAll();
    int deleteById(Long id);
    Long add(SubCategory category);
    int modify(SubCategory category);
    SubCategory findById(Long id);
    List<SubCategory> findByCategoryId(Long categoryId);
}
