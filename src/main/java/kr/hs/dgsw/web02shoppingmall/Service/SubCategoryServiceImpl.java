package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.SubCategory;
import kr.hs.dgsw.web02shoppingmall.Domain.SubCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryMapper subCategoryMapper;

    @Override
    public List<SubCategory> findAll() {
        return subCategoryMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return subCategoryMapper.deleteById(id);
    }

    @Override
    public Long add(SubCategory subCategory) {
        return subCategoryMapper.add(subCategory);
    }

    @Override
    public int modify(SubCategory subCategory) {
        return subCategoryMapper.modify(subCategory);
    }

    @Override
    public SubCategory findById(Long id) {
        return subCategoryMapper.findById(id);
    }

    @Override
    public List<SubCategory> findByCategoryId(Long categoryId) {
        return subCategoryMapper.findByCategoryId(categoryId);
    }
}
