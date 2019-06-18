package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Cart;

import java.util.List;

public interface CartService {

    List<Cart> findAll();
    int deleteById(Long id);
    Long add(Cart cart);
    int modify(Cart cart);
    Cart findById(Long id);
    List<Cart> findByUserId(Long userId);
}
