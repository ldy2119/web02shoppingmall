package kr.hs.dgsw.web02shoppingmall.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SubCategoryMapper {

    List<SubCategory> findAll();
    int deleteById(@Param("id") Long id);
    Long add(SubCategory category);
    int modify(SubCategory category);
    SubCategory findById(@Param("id") Long id);
    List<SubCategory> findByCategoryId(@Param("categoryId") Long id);
}
