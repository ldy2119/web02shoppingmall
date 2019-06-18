package kr.hs.dgsw.web02shoppingmall.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartMapper {

    List<Cart> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Cart cart);
    int modify(Cart cart);
    Cart findById(@Param("id") Long id);
    List<Cart> findByUserId(@Param("userId") Long userId);
}
